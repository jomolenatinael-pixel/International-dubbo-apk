# Areka Supabase setup

## 1. Apply the migration

Apply [`supabase/migrations/20260929_areka_auth_sync.sql`](supabase/migrations/20260929_areka_auth_sync.sql) in the Supabase SQL Editor. It preserves the existing `profiles`, `attempts`, `quizzes`, `questions`, and `choices` data model, extends `profiles`, and adds the app-owned `quiz_attempts`, `flashcard_progress`, and `areka_leaderboard` objects.

The existing `attempts` table is intentionally not reshaped because it lacks a user identity and uses a different schema. New Areka attempts go to `quiz_attempts`.

## 2. Configure Android locally

Create `local.properties` at the repository root. Do not commit it:

```properties
sdk.dir=/path/to/your/Android/sdk
SUPABASE_URL=https://YOUR_PROJECT_REF.supabase.co
SUPABASE_ANON_KEY=YOUR_PUBLISHABLE_OR_ANON_KEY
```

The Android app reads these values into `BuildConfig`. It never needs or accepts a Supabase service-role key.

## 3. Authentication behavior

- Guest mode remains fully usable without a network or account.
- Profile contains email/password sign-in, account creation, and sign-out.
- Supabase Auth sessions are persisted in app-private SharedPreferences and refreshed on startup.
- Google OAuth is not enabled in this minimal phase; email/password is enabled in the connected project.
- If email confirmation is enabled, account creation asks the learner to confirm their email before signing in.
- `natijommar@gmail.com` is marked server-side with `profiles.is_admin = true` by the Auth trigger and current-user RPC. The Android UI derives the badge from the verified Auth email and displays **Admin**.

## 4. What is local vs cloud

| Data | Local Room / bundled data | Supabase |
|---|---|---|
| Curriculum, quizzes, flashcards | Primary source; always available offline | Optional question-bank refresh already supported |
| Quiz completion | Written first to Room | Best-effort `quiz_attempts` upload; failed authenticated uploads are queued locally and retried |
| Profile points/streak | Primary local state | Best-effort profile upsert |
| Leaderboard | Empty honest guest state | `areka_leaderboard` for authenticated users |
| Flashcard schedule | Primary local state | Optional `flashcard_progress` backup table; sync hook reserved for the next pass |

Cloud calls run on the IO dispatcher after local writes and never block quiz or flashcard screens. Profile conflict policy is **monotonic server-wins** for `total_points` and `streak_days`: sync uses the higher value. Guest leaderboard rows are intentionally empty rather than seeded with fictional students.

## 5. Validation checklist

- [ ] Guest opens Home, Quiz, Flashcards, and Profile with no Supabase configuration.
- [ ] Guest completes a quiz while offline; Room stores the attempt.
- [ ] Sign up with email/password; confirm email if required.
- [ ] Sign in and restart the app; session is restored.
- [ ] Complete a quiz while authenticated and online; verify a row in `quiz_attempts`.
- [ ] Verify `profiles` points/streak update and `areka_leaderboard` appears in Profile.
- [ ] Sign out; Profile returns to guest mode and local study remains available.
- [ ] Sign up/sign in as `natijommar@gmail.com`; confirm the Profile **Admin** badge and `profiles.is_admin = true`.
- [ ] Restart after sign-in; confirm the session and Admin badge persist.
