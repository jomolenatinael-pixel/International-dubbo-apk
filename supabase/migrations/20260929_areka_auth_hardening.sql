-- Areka authentication & RLS hardening pass
-- Ensures complete CRUD policies on user-owned tables tied strictly to auth.uid()
-- Restricts public curriculum tables to read-only for client roles
-- Secures RPC execution privileges and storage bucket access

-- ==============================================================================
-- 1. Profiles: allow account self-deletion and strictly verify ownership
-- ==============================================================================
grant delete on public.profiles to authenticated;
drop policy if exists "areka_profiles_delete_own" on public.profiles;
create policy "areka_profiles_delete_own" on public.profiles
for delete to authenticated using (id = auth.uid());

-- ==============================================================================
-- 2. Quiz Attempts: allow update (for idempotent upsert merge-duplicates) and delete
-- ==============================================================================
grant update, delete on public.quiz_attempts to authenticated;

drop policy if exists "areka_attempts_update_own" on public.quiz_attempts;
create policy "areka_attempts_update_own" on public.quiz_attempts
for update to authenticated
using (user_id = auth.uid())
with check (user_id = auth.uid());

drop policy if exists "areka_attempts_delete_own" on public.quiz_attempts;
create policy "areka_attempts_delete_own" on public.quiz_attempts
for delete to authenticated
using (user_id = auth.uid());

-- ==============================================================================
-- 3. Flashcard Progress: allow delete (for unit progress resets and cleanup)
-- ==============================================================================
grant delete on public.flashcard_progress to authenticated;

drop policy if exists "areka_flashcards_delete_own" on public.flashcard_progress;
create policy "areka_flashcards_delete_own" on public.flashcard_progress
for delete to authenticated
using (user_id = auth.uid());

-- ==============================================================================
-- 4. User Roles: strictly read-only for own row, no client mutations
-- ==============================================================================
revoke insert, update, delete on public.user_roles from anon, authenticated;
grant select on public.user_roles to authenticated;
drop policy if exists "areka_roles_select_own" on public.user_roles;
create policy "areka_roles_select_own" on public.user_roles
for select to authenticated using (user_id = auth.uid());

-- Restrict RPC execution: only authenticated users can check their own admin status
revoke execute on function public.sync_current_user_admin() from public, anon;
grant execute on function public.sync_current_user_admin() to authenticated;

-- ==============================================================================
-- 5. Curriculum Content (quizzes, questions, choices): Read-only for learners
-- ==============================================================================
do $$
begin
  if exists (select 1 from information_schema.tables where table_schema = 'public' and table_name = 'quizzes') then
    alter table public.quizzes enable row level security;
    revoke insert, update, delete on public.quizzes from anon, authenticated;
    grant select on public.quizzes to anon, authenticated;
    drop policy if exists "areka_quizzes_public_select" on public.quizzes;
    create policy "areka_quizzes_public_select" on public.quizzes for select to anon, authenticated using (true);
  end if;

  if exists (select 1 from information_schema.tables where table_schema = 'public' and table_name = 'questions') then
    alter table public.questions enable row level security;
    revoke insert, update, delete on public.questions from anon, authenticated;
    grant select on public.questions to anon, authenticated;
    drop policy if exists "areka_questions_public_select" on public.questions;
    create policy "areka_questions_public_select" on public.questions for select to anon, authenticated using (true);
  end if;

  if exists (select 1 from information_schema.tables where table_schema = 'public' and table_name = 'choices') then
    alter table public.choices enable row level security;
    revoke insert, update, delete on public.choices from anon, authenticated;
    grant select on public.choices to anon, authenticated;
    drop policy if exists "areka_choices_public_select" on public.choices;
    create policy "areka_choices_public_select" on public.choices for select to anon, authenticated using (true);
  end if;
end $$;

-- ==============================================================================
-- 6. Storage Bucket Policies (Avatars / Assets)
-- ==============================================================================
do $$
begin
  if exists (select 1 from information_schema.tables where table_schema = 'storage' and table_name = 'objects') then
    -- Public read for avatars
    drop policy if exists "areka_avatars_public_read" on storage.objects;
    create policy "areka_avatars_public_read" on storage.objects
    for select to anon, authenticated
    using (bucket_id = 'avatars');

    -- Authenticated users can upload avatars only under their own auth.uid() folder
    drop policy if exists "areka_avatars_user_write" on storage.objects;
    create policy "areka_avatars_user_write" on storage.objects
    for insert to authenticated
    with check (bucket_id = 'avatars' and (storage.foldername(name))[1] = auth.uid()::text);

    drop policy if exists "areka_avatars_user_update" on storage.objects;
    create policy "areka_avatars_user_update" on storage.objects
    for update to authenticated
    using (bucket_id = 'avatars' and (storage.foldername(name))[1] = auth.uid()::text);

    drop policy if exists "areka_avatars_user_delete" on storage.objects;
    create policy "areka_avatars_user_delete" on storage.objects
    for delete to authenticated
    using (bucket_id = 'avatars' and (storage.foldername(name))[1] = auth.uid()::text);
  end if;
end $$;
