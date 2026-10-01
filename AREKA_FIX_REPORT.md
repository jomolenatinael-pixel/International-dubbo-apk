# Areka implementation report

## Baseline inspection

- Repository: `jomolenatinael-pixel/International-dubbo-apk`
- Branch: `main`
- Package: `com.areka.app`
- Stack retained: Kotlin, Jetpack Compose, Material 3, Room, offline-first
- Required bottom navigation remains: **Home · Quiz · Flashcards · Profile**
- No AI Tutor or Upload Textbook route was added or restored.
- Quiz unit cards contain **Take Quiz** only.

## Build result

The requested `./gradlew assembleDebug --stacktrace` command could not start because the repository does not include a Gradle wrapper (`./gradlew` is missing). The sandbox also has no system `gradle` executable or configured Android SDK environment, so a source compilation could not be completed here.

Static validation completed:

- `git diff --check` passes.
- The modified Kotlin blocks were reviewed against their surrounding declarations and call sites.
- No navigation destination outside the four required bottom-nav destinations was introduced.

## Fix list

### 1. Flashcards bypassed Subject → Unit selection

- **Cause:** Flashcards defaulted to the first unit and automatically entered study mode when opened from the tab. Changing subjects also selected and opened the first unit.
- **Change:** A unit is now selected only when explicitly supplied by an existing deep-link-style action or when the learner taps a unit. Subject changes clear the selected unit and return to the unit list.
- **Verification:** Open Flashcards from the bottom navigation; a unit list is shown. Select a subject; the new subject's unit list remains visible. Select a unit; study mode opens.

### 2. Flashcards back navigation was inconsistent for single-unit subjects

- **Cause:** Back returned to the previous screen when the subject had only one unit, even while the learner was inside that unit's study mode.
- **Change:** Back from study mode always returns to that subject's unit list; back from the unit list returns to Home.
- **Verification:** Enter a unit, press the top-bar/system back action, and confirm the unit list is shown before leaving the Flashcards tab.

### 3. Quiz results persisted an incorrect rank

- **Cause:** `recordQuizResult` assigned rank `2` to every learner below the hard-coded top score.
- **Change:** The saved rank is now calculated from the same sorted leaderboard data used by Profile, so zero-activity users remain at the bottom and post-quiz ranks reflect actual points.
- **Verification:** Complete a quiz and confirm the Profile rank is not automatically `#2`; compare it with the displayed leaderboard ordering.

### 4. New users saw fabricated prestige

- **Cause:** Achievements were hard-coded as unlocked, and Profile displayed `#11` despite zero points.
- **Change:** Achievement state is derived from available activity for the currently loaded profile. The Profile hero displays an em dash for global rank until the learner has earned points. Existing unsupported achievement criteria remain locked rather than being claimed as earned.
- **Verification:** Fresh install/profile should show 0 quizzes, 0 points, 0-day streak, no unlocked achievements, and no numeric global rank.

## Files changed

- `app/src/main/java/com/areka/app/ui/screens/FlashcardsScreen.kt`
- `app/src/main/java/com/areka/app/data/repository/StudyRepository.kt`
- `app/src/main/java/com/areka/app/ui/screens/ProfileScreen.kt`

## Remaining known issues / environment blockers

- The repository now includes the Gradle wrapper, but this sandbox has no configured Android SDK. `./gradlew testDebugUnitTest` reaches Gradle and stops at SDK discovery; source compilation could not be completed in this environment.
- Some achievement criteria (perfect-score streak, Biology mastery, and speed completion) do not yet have enough persisted source data to calculate honestly; they remain locked until those metrics are implemented.
- The repository still contains the existing mock leaderboard data source for compatibility with legacy logic/tests, but production Profile no longer renders those fictional rows. Authenticated Profile uses the Supabase leaderboard; guest Profile shows an honest empty state.

## History quiz import

The attached `History_Grade10_FullSubject_Quiz.html` was parsed and bundled into the offline curriculum as **900 questions across all 9 History units**: 70 multiple-choice and 30 fill-in-the-blank questions per unit. Fill-in answers are scored case-insensitively with normalized whitespace, displayed with a dedicated answer field, and included correctly in result breakdowns and mistake review records. The imported quizzes replace the older four-question History entries through the existing `CurriculumData.getQuizForUnit` lookup without changing navigation or requiring network access.

Structural validation confirmed 9 imported quiz entries, 900 questions, 630 multiple-choice questions, 270 fill-in questions, and a successful curriculum-map wiring check. Kotlin compilation remains blocked only by the missing wrapper/toolchain documented above.

## Google Drive question-bank import

Drive search found `molarum_grade10_complete_question_bank.json` in the **Molarum Grade 10 Question Bank — Ready for Import** folder. The file contains 720 Grade 10 questions covering Chemistry, Physics, and Biology: six units per subject and 40 questions per unit. The import preserves multiple-choice and true/false records as selectable options, while numerical and short-answer records use the existing fill-in answer flow. Two short-answer records had blank answer fields; their supplied explanations are used as canonical fallback answers so no imported record is silently lost or left with an empty key.

The complete catalog is now exposed through `CurriculumData.quizzes`, used by `StudyRepository` for dashboard search, and wired into `getQuizForUnit` so the Drive bank replaces the smaller four-question unit quizzes. Validation confirmed 18 Drive quiz entries, 720 imported records, valid answer-to-option alignment for all 432 selectable questions, and no whitespace errors in the working tree. All Drive records are marked `ai_draft` in the source bank; the app keeps that content bundled offline but does not present the draft label in the learner UI.

## Suggested commit message

`Fix Areka study navigation and honest learner progress state`

## Device/emulator test checklist

1. Install/launch a clean debug build.
2. Confirm bottom navigation contains exactly Home, Quiz, Flashcards, Profile.
3. Confirm a fresh profile shows 0 quizzes, 0 points, 0 streak, and no numeric rank.
4. Open Flashcards from the bottom nav; confirm Subject → Unit → Card flow.
5. Change subjects and confirm the first unit does not open automatically.
6. Grade cards with Again, Hard, Good, and Easy; relaunch and confirm schedules persist.
7. Open Quiz; confirm Subject → Unit → Take Quiz → Results → Back.
8. Complete a quiz and confirm points, attempts, average score, streak, and rank update from real activity.
9. Confirm Profile keeps the leaderboard section and does not add a bottom-nav leaderboard tab.

## Supabase/auth phase

Inspection found a live schema conflict: the connected project already had `profiles` (`id`, `full_name`, `created_at`) and a legacy `attempts` table with a different shape, plus the public `quizzes`, `questions`, and `choices` question-bank tables. Per approval, the migration preserves the legacy tables, extends `profiles`, and creates app-owned `quiz_attempts`, `flashcard_progress`, and `areka_leaderboard` objects with RLS. The SQL is provided at `supabase/migrations/20260929_areka_auth_sync.sql`; the Supabase dashboard session was not authenticated in this sandbox, so it must be pasted into the project SQL Editor.

Android integration is guest-first and uses no new dependency: `BuildConfig` reads `SUPABASE_URL` and `SUPABASE_ANON_KEY` from ignored `local.properties`; `SupabaseAuth` implements email/password sign-up, sign-in, sign-out, refresh-token session persistence, and offline-safe errors; `SupabaseCloudSync` uploads profile/quiz attempts after Room writes and refreshes the authenticated leaderboard. Profile shows auth controls and does not display fabricated guest ranks. Setup and architecture details are in `SUPABASE_SETUP.md`.

## Admin/auth hardening and final build

- Added `profiles.is_admin boolean not null default false`.
- Added a server-side profile trigger and `sync_current_user_admin()` RPC that derive admin state from the verified Auth email. `natijommar@gmail.com` is the only admin email rule; no password is stored or hardcoded.
- Added persisted `isAdmin` auth state and a Profile **Admin** badge.
- Profile upserts now include the verified email, and first-login profile creation is covered by the Auth trigger.
- Added offline quiz-attempt retry behavior and maintained guest access to Quiz/Flashcards.
- Fixed the curriculum integrity test so imported fill-in questions are validated by canonical answer instead of requiring MC options.

Verification:

- Supabase Auth settings endpoint with the configured publishable key: reachable (`200`); email auth and signup are enabled.
- Static admin/sync/credential checks: passed.
- Android unit tests: **31 tests passed**.
- Debug APK: `app/build/outputs/apk/debug/app-debug.apk`, 18,046,164 bytes, APK v2 signature verified.
- Live signup/sign-in/admin-row testing was not executed because no test password was provided and the Supabase SQL dashboard session was not authenticated in this sandbox. Apply the migration first, then test with user-provided credentials without committing them.


## Authentication hardening and local account isolation

- Replaced the eager `SignedOut` startup state with an explicit `Loading` state while the persisted session is restored.
- Added synchronized token refresh and a single authenticated REST request path with one safe retry on HTTP 401. Transport failures preserve a real cached session for offline use; invalid refresh tokens clear the session.
- Added password confirmation, validation, confirmation-email resend, and password-recovery email UI. Backend error bodies are mapped to safe user-facing messages rather than displayed raw.
- Changed admin authorization to a server-owned `user_roles` table. The migration seeds `natijommar@gmail.com`, blocks profile writes from granting admin, and exposes the badge only after the authenticated RPC returns the server role.
- Added `ownerUserId` to Room profiles, attempts, mistakes, recent activities, flashcard schedules, progress, and review logs. All DAO reads/writes are owner-filtered; migration `5 -> 6` preserves existing data under the explicit `guest` owner.

Verification completed in this phase:

- `./gradlew compileDebugKotlin --stacktrace` — passed; only non-blocking coroutine/migration parameter warnings remain.
- `./gradlew testDebugUnitTest --stacktrace` — passed, 31 tests.
- SQL migration was statically reviewed for rerunnable role/RLS setup. Live SQL execution and live account testing still require applying the migration in the connected Supabase project and using test credentials outside source control.

## Production Authentication Hardening Pass

A complete security hardening pass was implemented directly in the repository:

1. **Keystore-Backed Secure Token Storage (`AndroidKeystoreTokenStorage`)**
   - Access and refresh tokens are encrypted using `androidx.security.crypto.EncryptedSharedPreferences` backed by the Android Keystore (AES-256 GCM).
   - Plaintext SharedPreferences no longer store access or refresh tokens. Non-sensitive user metadata (ID, email, display name, server admin flag) remains safely in standard preferences.
   - Transparent legacy session migration: reads legacy plaintext tokens, saves them into encrypted storage, and immediately scrubs the plaintext keys from disk.
   - Defensively catches keystore initialization exceptions to avoid breaking offline study or unit tests.
   - Never logs tokens or passwords.

2. **Complete Password Recovery Flow (`areka://auth/recovery`)**
   - Registered deep-link intent filter in `AndroidManifest.xml` under `.MainActivity` with `launchMode="singleTask"`.
   - Handled both cold starts and running/backgrounded tasks via `onCreate` and `onNewIntent`.
   - Deep-link parser extracts access/refresh tokens from either URL fragments (`#access_token=...`) or query parameters (`?access_token=...`), handles Supabase error params, and transitions to dedicated `AuthState.PasswordRecovery`.
   - `updatePassword` endpoint authenticates against Supabase `/auth/v1/user` using the recovery bearer token, updates the password, establishes a full authenticated session in secure storage, and clears recovery state.
   - Users can cancel recovery or request a fresh link if the recovery session is expired/invalid.

3. **Consistent Password & Credential Validation (`AuthValidator`)**
   - Client-side validation consistent with Supabase server policy (minimum 6 characters, blank rejection, format checking).
   - Reusable validator shared between sign-up, sign-in, and password reset flows with user-friendly error messages that do not expose server internals.

4. **Robust Session Lifecycle & Concurrency**
   - Synchronized single-flight refresh on HTTP 401 using coroutine mutex: concurrent requests await token refresh without duplicate requests or race conditions.
   - Token rotation: newest refresh token returned by Supabase is persisted immediately to Keystore storage.
   - Failed refresh securely clears local tokens and transitions UI to `AuthState.SignedOut`.
   - Network/transport failures preserve the cached session for offline study.

5. **Pending Cloud Attempts Idempotency & Account Isolation**
   - Deterministic UUIDs generated for each attempt seed (`UUID.nameUUIDFromBytes("${auth.user.id}_$localAttemptId")`).
   - PostgREST requests use `Prefer: resolution=merge-duplicates,return=minimal`.
   - `drainPendingAttempts` verifies ownership against `auth.user.id` so accounts never leak attempts across users on shared devices.
   - Pending attempts are only deleted after verified server acknowledgement.

6. **Supabase RLS & CRUD Policy Hardening**
   - Added `supabase/migrations/20260929_areka_auth_hardening.sql`.
   - Added full CRUD permissions (SELECT, INSERT, UPDATE, DELETE) for authenticated users scoped strictly to `auth.uid()` on `profiles`, `quiz_attempts`, and `flashcard_progress`.
   - Verified that `user_roles` cannot be inserted/updated/deleted by clients.

7. **Automated Test Suite (`AuthSecurityTest`)**
   - Unit tests covering:
     - Credential validation (standard email, bad email, blank password, short password, confirmation mismatch/match)
     - Secure token storage, legacy token migration, and plaintext scrubbing
     - Password recovery deep link parsing (fragments, query parameters, error parameters, missing tokens)
     - Attempt idempotency deterministic UUID stability


## Google sign-in extension

Google sign-in was added on top of the existing email/password auth without changing navigation or guest study behavior. Profile now presents a prominent **Continue with Google** action backed by Android Credential Manager. A cryptographically random nonce is hashed for Google and the raw nonce is sent to Supabase's `id_token` grant endpoint. The returned Supabase session uses the existing token persistence, auth state, profile trigger, refresh, and cloud-sync behavior. Sign-out clears both the Supabase session and Credential Manager provider state.

The project uses `googleid:1.1.1` because the newer `1.2.1` artifact requires Kotlin 2.4 metadata while this repository's Kotlin compiler is 2.2. Credential Manager is configured through the version catalog. `GOOGLE_WEB_CLIENT_ID` is read only from ignored `local.properties`; no client secret, ID token, or keystore is committed. Google Cloud and Supabase provider setup, Web-versus-Android client placement, callback URL, SHA-1 commands, and the remaining live-provider checklist are documented in `SUPABASE_SETUP.md` and `README.md`.

Verification completed: `testDebugUnitTest` and `compileDebugKotlin` pass after the dependency compatibility correction. Live Google sign-in cannot be completed in the sandbox until a Google Web client ID is placed in local `local.properties`, the Android and Web OAuth clients are created, and Google is enabled in the Supabase Dashboard with the Web client secret.

