# International Dubbo APK (Areka Study Suite)

**International Dubbo APK** is an Android offline-first learning platform built with Kotlin and Jetpack Compose. The application uses the internal package identifier `com.areka.app` and provides interactive study, quiz, flashcard spaced-repetition, mistake review, and learner progress tracking for the official Grade 10 curriculum.

## Features

- **Dashboard:** "Today's Study" overview, continue last study session, flashcard review queue count, and mistake review access.
- **Subject & Unit Navigation:** 9 official Grade 10 subjects (Mathematics, Physics, Chemistry, Biology, Geography, Civics, Economics, History, Information Technology) with 66 curriculum units.
- **Curriculum Quizzes:** Hand-authored and curriculum-aligned unit quizzes with immediate scoring, answer explanations, time tracking, and mistake recording.
- **Flashcard Spaced Repetition:** SM-2 inspired Leitner/spaced-repetition scheduler with 4 response ratings (`Again`, `Hard`, `Good`, `Easy`), persistent review intervals, and due-card queues.
- **Mistake Tracking & Review:** Open mistakes from quizzes are automatically recorded in Room database and can be reviewed and cleared individually or in bulk.
- **Profile & Achievements:** Real-time learner statistics (points, quizzes completed, average accuracy, streak days). Achievements and daily streak badges are calculated honestly based on user activity rather than hardcoded unlocks.
- **Leaderboards:** Local deterministic leaderboard calculating user rank dynamically from actual points, with an extensible `LeaderboardDataSource` interface prepared for remote Supabase integration.
- **Theming:** Full Material Design 3 light and dark theme support.
- **Offline-First Resilience:** All learning content, flashcards, attempts, schedules, and profile state are persisted locally via Room database.
- **Optional Google Sign-In:** Profile supports Credential Manager Google ID-token sign-in through Supabase while guest study remains fully available offline.

## Technology stack

- **Language:** Kotlin 2.1.10
- **UI Framework:** Jetpack Compose & Material 3 (Compose BOM 2025.02.00)
- **Architecture:** MVVM / Clean Repository Pattern (Domain-focused repositories: `QuizRepository`, `FlashcardRepository`, `ProfileRepository`, `MistakeRepository`, `LeaderboardRepository`)
- **Persistence:** Room 2.7.0-alpha13 (SQLite) with Kotlin Symbol Processing (KSP)
- **Concurrency:** Kotlin Coroutines & StateFlow / Flow
- **Remote Sync Architecture:** `RemoteQuestionDataSource` interface with `SupabaseQuestionSync` client using structured `SyncResult` (`Success`, `Cached`, `NetworkError`, `ServerError`, `ParseError`, `AuthError`), backed by local JSON cache
- **Build System:** Gradle 9.3.1 with Android Gradle Plugin 9.1.1
- **Target SDK:** Android 36 (VanillaIceCream / Android 15/16)
- **Minimum SDK:** Android API 24 (Android 7.0 Nougat)
- **Testing:** Local JVM testing with JUnit 4, Robolectric, and Roborazzi screenshot verification

## Project structure

```text
app/src/main/java/com/areka/app/
├── data/
│   ├── local/                 # Room database (AppDatabase), entities, DAOs, migrations
│   ├── model/                 # Domain data models (Quiz, Flashcard, UserProfile, etc.)
│   ├── remote/                # Remote sync abstractions (SyncResult, SupabaseQuestionSync)
│   └── repository/            # Domain repositories (QuizRepository, FlashcardRepository,
│                              # ProfileRepository, MistakeRepository, LeaderboardRepository,
│                              # AchievementCalculator, CurriculumData, StudyRepository facade)
├── ui/
│   ├── components/            # Navigation, dialogs (MistakesReviewDialog), cards, buttons
│   ├── screens/               # DashboardScreen, QuizScreen, FlashcardsScreen, ProfileScreen
│   ├── theme/                 # Material 3 ColorScheme, Typography, Shapes, Theme
│   └── viewmodel/             # App state and UI coordination
├── ArekaApplication.kt
└── MainActivity.kt
```

## Requirements

- Android Studio Meerkat or newer / compatible Android CLI build environment
- **JDK 17** (mandatory toolchain requirement)
- Android SDK 36
- Android device or emulator running API 24 or later

## Build and test

From the repository root:

```bash
# Build the debug APK
gradle assembleDebug

# Run local JVM unit & Robolectric tests
gradle :app:testDebugUnitTest

# Run verification checks
gradle check
```

## Local Supabase and Google configuration

Create an ignored `local.properties` file at the repository root with:

```properties
SUPABASE_URL=https://YOUR_PROJECT_REF.supabase.co
SUPABASE_ANON_KEY=YOUR_PUBLISHABLE_OR_ANON_KEY
GOOGLE_WEB_CLIENT_ID=YOUR_WEB_OAUTH_CLIENT_ID.apps.googleusercontent.com
```

`GOOGLE_WEB_CLIENT_ID` must be the **Web application** OAuth client ID, not the Android client ID. Register `com.areka.app` plus the debug/release SHA-1 in a separate Android OAuth client, then enable Google in Supabase with the Web client ID and Web client secret. See [`SUPABASE_SETUP.md`](SUPABASE_SETUP.md) for the exact callback URL, SHA-1 commands, and test checklist. Client secrets and access tokens must never be committed.

## Application metadata

- **Application ID:** `com.areka.app`
- **Namespace:** `com.areka.app`
- **Build Type:** Debug & Release signing configurations configured for container and CI/CD environments.
