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
