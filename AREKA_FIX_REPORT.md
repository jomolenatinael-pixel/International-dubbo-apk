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

- The repository has no Gradle wrapper, and this sandbox has no system Gradle or configured Android SDK, so `assembleDebug` could not be run here.
- Some achievement criteria (perfect-score streak, Biology mastery, and speed completion) do not yet have enough persisted source data to calculate honestly; they remain locked until those metrics are implemented.
- The repository still contains the existing mock leaderboard data source; it is used for the in-app leaderboard presentation and is not a network-backed ranking service.

## History quiz import

The attached `History_Grade10_FullSubject_Quiz.html` was parsed and bundled into the offline curriculum as **900 questions across all 9 History units**: 70 multiple-choice and 30 fill-in-the-blank questions per unit. Fill-in answers are scored case-insensitively with normalized whitespace, displayed with a dedicated answer field, and included correctly in result breakdowns and mistake review records. The imported quizzes replace the older four-question History entries through the existing `CurriculumData.getQuizForUnit` lookup without changing navigation or requiring network access.

Structural validation confirmed 9 imported quiz entries, 900 questions, 630 multiple-choice questions, 270 fill-in questions, and a successful curriculum-map wiring check. Kotlin compilation remains blocked only by the missing wrapper/toolchain documented above.

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
