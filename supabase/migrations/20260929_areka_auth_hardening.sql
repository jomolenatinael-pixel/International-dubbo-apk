-- Areka authentication & RLS hardening pass
-- Ensures complete CRUD policies on user-owned tables tied strictly to auth.uid()
-- Grants UPDATE and DELETE for idempotency and user data management

-- 1. Profiles: allow account self-deletion
grant delete on public.profiles to authenticated;
drop policy if exists "areka_profiles_delete_own" on public.profiles;
create policy "areka_profiles_delete_own" on public.profiles
for delete to authenticated using (id = auth.uid());

-- 2. Quiz Attempts: allow update (for idempotent upsert merge-duplicates) and delete
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

-- 3. Flashcard Progress: allow delete (for unit progress resets and cleanup)
grant delete on public.flashcard_progress to authenticated;

drop policy if exists "areka_flashcards_delete_own" on public.flashcard_progress;
create policy "areka_flashcards_delete_own" on public.flashcard_progress
for delete to authenticated
using (user_id = auth.uid());

-- 4. Audit: confirm user_roles is read-only for authenticated users and strictly scoped to own user
revoke insert, update, delete on public.user_roles from anon, authenticated;
grant select on public.user_roles to authenticated;
drop policy if exists "areka_roles_select_own" on public.user_roles;
create policy "areka_roles_select_own" on public.user_roles
for select to authenticated using (user_id = auth.uid());
