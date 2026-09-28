# International Dubbo APK

**International Dubbo APK** is an Android learning application built with Kotlin and Jetpack Compose. The project currently uses the internal application branding **Areka Study Suite** and provides interactive study, quiz, flashcard, progress-tracking, and leaderboard experiences.

## Features

- Dashboard with recent study activity and progress
- Subject and unit selection for Grade 10 curriculum content
- Interactive quizzes with answers, explanations, scoring, and results
- Flashcards with local progress tracking and spaced-review scheduling
- User profile, streaks, points, rankings, and leaderboard views
- Light and dark theme support
- Local persistence with Room database
- Optional Firebase and Gemini AI integration
- Compose UI screenshot and unit/instrumentation test setup

## Technology stack

- Kotlin
- Jetpack Compose and Material 3
- Android Gradle Plugin and Gradle Kotlin DSL
- Android SDK 36.1
- Minimum Android API 24
- Target Android API 36
- Room for local data persistence
- Kotlin Coroutines and Flow
- Retrofit, OkHttp, Moshi, and Coil
- Firebase AI, App Check, and Google Services plugins
- Robolectric and Roborazzi test tooling

## Project structure

```text
app/src/main/java/com/areka/app/
├── data/
│   ├── local/                 # Room database, entities, and DAOs
│   ├── model/                 # Domain models
│   └── repository/            # Curriculum data, study repository, scheduler
├── ui/
│   ├── components/            # Navigation and reusable Compose components
│   ├── screens/               # Dashboard, quiz, flashcard, profile, leaderboard
│   ├── theme/                 # Colors, typography, and app theme
│   └── viewmodel/             # App state and UI logic
├── ArekaApplication.kt
└── MainActivity.kt
```

## Requirements

- Android Studio with Android SDK 36.1 or a compatible Android build environment
- JDK 11
- Android device or emulator running API 24 or later
- Optional Firebase configuration when Firebase-backed features are enabled
- Optional Gemini API configuration for AI features

## Configuration

The project includes `.env.example` as a template for local secrets. Copy it to `.env` only in a local, ignored working copy and provide the required values through your development environment or Android Studio Secrets configuration.

Never commit API keys, passwords, signing keys, `google-services.json`, or other private credentials to Git.

Release signing values are read from environment variables when building a release APK:

- `KEYSTORE_PATH`
- `STORE_PASSWORD`
- `KEY_PASSWORD`

The key alias is configured as `upload` in `app/build.gradle.kts`.

## Build and test

From the repository root:

```bash
# Build the debug APK
./gradlew assembleDebug

# Run JVM unit tests
./gradlew test

# Run Android lint checks
./gradlew lint

# Run all configured verification tasks
./gradlew check
```

The debug APK is generated under:

```text
app/build/outputs/apk/debug/app-debug.apk
```

## Git workflow

```bash
git clone https://github.com/jomolenatinael-pixel/International-dubbo-apk.git
cd International-dubbo-apk
git checkout main
```

Create a feature branch for changes, run the relevant checks, and open a pull request or push directly to `main` when appropriate.

## Project status

This repository is an active Android Studio project. The app identifier is currently `com.aistudio.areka.kpmzq`, while the source namespace is `com.areka.app`.
