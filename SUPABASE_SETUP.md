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
GOOGLE_WEB_CLIENT_ID=YOUR_WEB_OAUTH_CLIENT_ID.apps.googleusercontent.com
```

The Android app reads these values into `BuildConfig`. It never needs or accepts a Supabase service-role key.

## 3. Authentication behavior

- Guest mode remains fully usable without a network or account.
- Profile contains validated email/password sign-in, account creation with password confirmation, confirmation-email resend, password-recovery email, and sign-out.
- Supabase Auth sessions start in a visible loading state, are persisted in app-private SharedPreferences, and are refreshed on startup. A transport outage keeps a real cached session for offline study; an invalid refresh token signs out.
- Authenticated REST requests use one centralized client, retry one 401 after refresh, and never expose backend response text as user-facing errors.
- Google sign-in uses Android Credential Manager and a nonce-bound Google ID token. The app sends that token to `/auth/v1/token?grant_type=id_token`; the resulting Supabase access/refresh tokens use the same persistence and refresh path as email sign-in.
- If email confirmation is enabled, account creation asks the learner to confirm their email before signing in.
- `natijommar@gmail.com` is seeded into the server-owned `user_roles` table. The current-user RPC copies that role to `profiles.is_admin`; Android displays **Admin** only after the RPC response, never from a client email check.

## 4. What is local vs cloud

| Data | Local Room / bundled data | Supabase |
|---|---|---|
| Curriculum, quizzes, flashcards | Primary source; always available offline | Optional question-bank refresh already supported |
| Quiz completion | Written first to Room | Best-effort `quiz_attempts` upload; failed authenticated uploads are queued locally and retried |
| Profile points/streak | Primary local state | Best-effort profile upsert |
| Leaderboard | Empty honest guest state | `areka_leaderboard` for authenticated users |
| Flashcard schedule | Primary local state | Optional `flashcard_progress` backup table; sync hook reserved for the next pass |

Cloud calls run on the IO dispatcher after local writes and never block quiz or flashcard screens. Profile conflict policy is **monotonic server-wins** for `total_points` and `streak_days`: sync uses the higher value. Guest leaderboard rows are intentionally empty rather than seeded with fictional students.

Room tables holding profiles, attempts, mistakes, activities, flashcard schedules, progress, and review logs carry an `ownerUserId` and are queried with the current Auth user ID (or the explicit `guest` owner). Migration `5 -> 6` preserves existing local data under the guest owner and prevents account switching from exposing another account's study state.

## 5. Enable Google in Supabase and Google Cloud

1. In Google Cloud Console, open **Google Auth Platform → Branding**, configure the consent screen, and request only `openid`, `email`, and `profile` scopes.
2. Create an **Android OAuth client** with package name `com.areka.app`. Add the debug SHA-1 for local testing and the release SHA-1 for production builds.
3. Create a separate **Web application OAuth client**. The Web client ID is the value used as Credential Manager's `serverClientId` and must be placed in local `GOOGLE_WEB_CLIENT_ID`. Do not use the Android client ID for this field.
4. In Supabase Dashboard → **Authentication → Providers → Google**, enable Google and paste the **Web client ID** and its **Web client secret**. Do not put the client secret in the Android app or `local.properties`.
5. In the Web client's authorized redirect URIs, add the Supabase callback shown by the project, normally `https://<PROJECT_REF>.supabase.co/auth/v1/callback`. The callback is used by Supabase's provider configuration; the native app receives its ID token through Credential Manager.
6. Confirm the Google provider is enabled, the Web client is first if Supabase lists multiple client IDs, and the project allows the test Google accounts.

### SHA-1 commands

For a local debug build, use `./gradlew signingReport` and copy the SHA-1 under the `debug` variant. Alternatively:

```bash
keytool -list -v -alias androiddebugkey \
  -keystore ~/.android/debug.keystore \
  -storepass android -keypass android
```

For a release build, run `./gradlew signingReport` with the release signing configuration or inspect the CI release keystore. Never commit keystores, client secrets, `local.properties`, or access tokens.

## 6. Validation checklist

- [ ] Guest opens Home, Quiz, Flashcards, and Profile with no Supabase configuration.
- [ ] Guest completes a quiz while offline; Room stores the attempt.
- [ ] Sign up with email/password; confirm email if required.
- [ ] Sign in and restart the app; session is restored.
- [ ] Complete a quiz while authenticated and online; verify a row in `quiz_attempts`.
- [ ] Verify `profiles` points/streak update and `areka_leaderboard` appears in Profile.
- [ ] Sign out; Profile returns to guest mode and local study remains available.
- [ ] Sign up/sign in as `natijommar@gmail.com`; confirm the Profile **Admin** badge and `profiles.is_admin = true`.
- [ ] Restart after sign-in; confirm the session and Admin badge persist.
- [ ] With Google enabled, tap **Continue with Google** on Profile and complete the Credential Manager flow.
- [ ] Verify Google success changes Profile to `SignedIn`, creates/updates the Supabase profile, and survives an app restart.
- [ ] Sign out and verify both the Supabase session and Google Credential Manager state are cleared.
- [ ] If Google fails, check that the Web client ID is in `GOOGLE_WEB_CLIENT_ID`, the Android package is exactly `com.areka.app`, and the SHA-1 matches the installed signing key.
