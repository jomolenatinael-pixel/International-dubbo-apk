-- Areka online features: preserve existing public content and legacy attempts.
-- Apply in Supabase SQL Editor or with the Supabase CLI.

create extension if not exists pgcrypto;

-- Existing profiles table is retained. Add only the Areka-owned fields that are absent.
alter table public.profiles enable row level security;
alter table public.profiles add column if not exists display_name text;
alter table public.profiles add column if not exists grade text not null default 'Grade 10';
alter table public.profiles add column if not exists streak_days integer not null default 0;
alter table public.profiles add column if not exists total_points integer not null default 0;
alter table public.profiles add column if not exists avatar_color text;
alter table public.profiles add column if not exists email text;
alter table public.profiles add column if not exists is_admin boolean not null default false;
alter table public.profiles add column if not exists updated_at timestamptz not null default now();

-- Keep full_name (the existing project column) and display_name compatible.
update public.profiles
set display_name = coalesce(nullif(display_name, ''), nullif(full_name, ''), 'Student')
where display_name is null or display_name = '';

create or replace function public.set_areka_updated_at()
returns trigger
language plpgsql
security invoker
set search_path = public
as $$
begin
  new.updated_at = now();
  return new;
end;
$$;

drop trigger if exists set_areka_profiles_updated_at on public.profiles;
create trigger set_areka_profiles_updated_at
before update on public.profiles
for each row execute function public.set_areka_updated_at();

-- Admin is server-owned; profile writes can never grant it.
create or replace function public.set_areka_admin_flag()
returns trigger
language plpgsql
security invoker
set search_path = public
as $$
begin
  if tg_op = 'UPDATE' then
    new.is_admin = coalesce(old.is_admin, false);
  else
    new.is_admin = false;
  end if;
  return new;
end;
$$;

drop trigger if exists set_areka_admin_flag on public.profiles;
create trigger set_areka_admin_flag
before insert or update on public.profiles
for each row execute function public.set_areka_admin_flag();

create table if not exists public.user_roles (
  user_id uuid primary key references auth.users(id) on delete cascade,
  role text not null check (role in ('admin', 'student')) default 'student',
  created_at timestamptz not null default now()
);

alter table public.user_roles enable row level security;
revoke all on public.user_roles from anon, authenticated;
grant select on public.user_roles to authenticated;
drop policy if exists "areka_roles_select_own" on public.user_roles;
create policy "areka_roles_select_own" on public.user_roles
for select to authenticated using (user_id = auth.uid());

insert into public.user_roles (user_id, role)
select id, 'admin' from auth.users
where lower(coalesce(email, '')) = 'natijommar@gmail.com'
on conflict (user_id) do update set role = 'admin';

update public.profiles p
set is_admin = exists (
  select 1 from public.user_roles r
  where r.user_id = p.id and r.role = 'admin'
);

-- New app-owned attempt table. The legacy public.attempts table is not reshaped.
create table if not exists public.quiz_attempts (
  id uuid primary key default gen_random_uuid(),
  user_id uuid not null references auth.users(id) on delete cascade,
  subject_id text not null,
  unit_id text not null,
  quiz_id text,
  score integer not null default 0 check (score between 0 and 100),
  total_questions integer not null check (total_questions > 0),
  points_earned integer not null default 0 check (points_earned >= 0),
  completed_at timestamptz not null default now()
);

create index if not exists quiz_attempts_user_completed_idx
on public.quiz_attempts(user_id, completed_at desc);

create table if not exists public.flashcard_progress (
  user_id uuid not null references auth.users(id) on delete cascade,
  card_id text not null,
  ease_factor real not null default 2.5,
  interval_days integer not null default 0,
  due_at timestamptz,
  reps integer not null default 0,
  lapses integer not null default 0,
  updated_at timestamptz not null default now(),
  primary key (user_id, card_id)
);

create index if not exists flashcard_progress_user_due_idx
on public.flashcard_progress(user_id, due_at);

drop trigger if exists set_areka_flashcard_progress_updated_at on public.flashcard_progress;
create trigger set_areka_flashcard_progress_updated_at
before update on public.flashcard_progress
for each row execute function public.set_areka_updated_at();

-- Auth-created users get a profile row. The app upsert remains as a retry-safe fallback.
create or replace function public.handle_areka_new_user()
returns trigger
language plpgsql
security definer
set search_path = public
as $$
begin
  insert into public.profiles (id, email, full_name, display_name, grade, is_admin)
  values (
    new.id,
    new.email,
    coalesce(new.raw_user_meta_data ->> 'display_name', new.email, 'Student'),
    coalesce(new.raw_user_meta_data ->> 'display_name', new.email, 'Student'),
    'Grade 10',
    false
  )
  on conflict (id) do update set
    email = coalesce(public.profiles.email, excluded.email),
    display_name = coalesce(nullif(public.profiles.display_name, ''), excluded.display_name),
    full_name = coalesce(nullif(public.profiles.full_name, ''), excluded.full_name);
  insert into public.user_roles (user_id, role)
  values (new.id, case when lower(coalesce(new.email, '')) = 'natijommar@gmail.com' then 'admin' else 'student' end)
  on conflict (user_id) do update set role = case
    when excluded.role = 'admin' then 'admin' else public.user_roles.role end;
  return new;
end;
$$;

drop trigger if exists on_auth_user_created_areka on auth.users;
create trigger on_auth_user_created_areka
after insert on auth.users
for each row execute function public.handle_areka_new_user();

-- Own-row policies. Existing policies with these names are replaced only.
drop policy if exists "areka_profiles_select_own" on public.profiles;
drop policy if exists "areka_profiles_insert_own" on public.profiles;
drop policy if exists "areka_profiles_update_own" on public.profiles;
revoke all on public.profiles from anon, authenticated;
grant select, insert, update on public.profiles to authenticated;
create policy "areka_profiles_select_own" on public.profiles
for select to authenticated using (id = auth.uid());
create policy "areka_profiles_insert_own" on public.profiles
for insert to authenticated with check (id = auth.uid());
create policy "areka_profiles_update_own" on public.profiles
for update to authenticated using (id = auth.uid()) with check (id = auth.uid());

-- Allows the app to repair/confirm the current user's admin flag without trusting client role input.
drop function if exists public.sync_current_user_admin();
create or replace function public.sync_current_user_admin()
returns table(is_admin boolean)
language plpgsql
security definer
set search_path = public
as $$
declare
  admin boolean;
  auth_email text;
begin
  select u.email, exists (
      select 1 from public.user_roles r
      where r.user_id = u.id and r.role = 'admin'
    )
    into auth_email, admin
  from auth.users u
  where u.id = auth.uid();

  update public.profiles
  set email = coalesce(public.profiles.email, auth_email),
      is_admin = coalesce(admin, false)
  where id = auth.uid();

  return query select coalesce(admin, false);
end;
$$;

grant execute on function public.sync_current_user_admin() to authenticated;

drop policy if exists "areka_attempts_select_own" on public.quiz_attempts;
drop policy if exists "areka_attempts_insert_own" on public.quiz_attempts;
grant select, insert on public.quiz_attempts to authenticated;
create policy "areka_attempts_select_own" on public.quiz_attempts
for select to authenticated using (user_id = auth.uid());
create policy "areka_attempts_insert_own" on public.quiz_attempts
for insert to authenticated with check (user_id = auth.uid());

drop policy if exists "areka_flashcards_select_own" on public.flashcard_progress;
drop policy if exists "areka_flashcards_upsert_own" on public.flashcard_progress;
grant select, insert, update on public.flashcard_progress to authenticated;
create policy "areka_flashcards_select_own" on public.flashcard_progress
for select to authenticated using (user_id = auth.uid());
create policy "areka_flashcards_upsert_own" on public.flashcard_progress
for insert to authenticated with check (user_id = auth.uid());
create policy "areka_flashcards_update_own" on public.flashcard_progress
for update to authenticated using (user_id = auth.uid()) with check (user_id = auth.uid());

-- The leaderboard is intentionally a view of public profile ranking fields.
drop view if exists public.areka_leaderboard;
create view public.areka_leaderboard
with (security_barrier = true)
as
select id, coalesce(nullif(display_name, ''), nullif(full_name, ''), 'Student') as display_name,
       grade, total_points, streak_days
from public.profiles;

grant select on public.areka_leaderboard to authenticated;
