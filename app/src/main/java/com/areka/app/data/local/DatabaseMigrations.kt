package com.areka.app.data.local

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

/** Adds the learning-attempt tables introduced after the original version 3 schema. */
val MIGRATION_3_4 = object : Migration(3, 4) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `quiz_attempts` (`id` TEXT NOT NULL, `quizId` TEXT NOT NULL, `quizTitle` TEXT NOT NULL, `subjectId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `scorePercent` INTEGER NOT NULL, `correctAnswers` INTEGER NOT NULL, `totalQuestions` INTEGER NOT NULL, `timeSpentSeconds` INTEGER NOT NULL, `completedAtEpochMillis` INTEGER NOT NULL, PRIMARY KEY(`id`))
            """.trimIndent()
        )
        database.execSQL("CREATE INDEX IF NOT EXISTS `index_quiz_attempts_unitId_completedAtEpochMillis` ON `quiz_attempts` (`unitId`, `completedAtEpochMillis`)")
        database.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `mistakes` (`id` TEXT NOT NULL, `quizId` TEXT NOT NULL, `questionId` INTEGER NOT NULL, `questionText` TEXT NOT NULL, `selectedAnswer` TEXT NOT NULL, `correctAnswer` TEXT NOT NULL, `subjectId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `explanation` TEXT NOT NULL, `createdAtEpochMillis` INTEGER NOT NULL, `reviewedAtEpochMillis` INTEGER, PRIMARY KEY(`id`))
            """.trimIndent()
        )
    }
}

/** Re-keys mistakes by their stable quiz/question identity and removes duplicate rows. */
val MIGRATION_4_5 = object : Migration(4, 5) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE `mistakes_new` (`quizId` TEXT NOT NULL, `questionId` INTEGER NOT NULL, `questionText` TEXT NOT NULL, `selectedAnswer` TEXT NOT NULL, `correctAnswer` TEXT NOT NULL, `subjectId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `explanation` TEXT NOT NULL, `createdAtEpochMillis` INTEGER NOT NULL, `reviewedAtEpochMillis` INTEGER, PRIMARY KEY(`quizId`, `questionId`))")
        database.execSQL("INSERT OR REPLACE INTO `mistakes_new` (`quizId`, `questionId`, `questionText`, `selectedAnswer`, `correctAnswer`, `subjectId`, `unitId`, `explanation`, `createdAtEpochMillis`, `reviewedAtEpochMillis`) SELECT `quizId`, `questionId`, `questionText`, `selectedAnswer`, `correctAnswer`, `subjectId`, `unitId`, `explanation`, `createdAtEpochMillis`, `reviewedAtEpochMillis` FROM `mistakes` ORDER BY `createdAtEpochMillis` ASC")
        database.execSQL("DROP TABLE `mistakes`")
        database.execSQL("ALTER TABLE `mistakes_new` RENAME TO `mistakes`")
        database.execSQL("CREATE INDEX `index_mistakes_unitId` ON `mistakes` (`unitId`)")
    }
}

/** Adds explicit owner IDs so a shared device cannot expose one account's study state to another. */
val MIGRATION_5_6 = object : Migration(5, 6) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL("CREATE TABLE `user_profile_new` (`ownerUserId` TEXT NOT NULL, `id` INTEGER NOT NULL, `name` TEXT NOT NULL, `grade` TEXT NOT NULL, `streakDays` INTEGER NOT NULL, `totalQuizzes` INTEGER NOT NULL, `averageScore` INTEGER NOT NULL, `timeStudiedHours` INTEGER NOT NULL, `globalRank` INTEGER NOT NULL, `totalPoints` INTEGER NOT NULL, `isDarkTheme` INTEGER NOT NULL, `lastActiveDateEpochDay` INTEGER NOT NULL, PRIMARY KEY(`ownerUserId`, `id`))")
        database.execSQL("INSERT INTO `user_profile_new` SELECT 'guest', `id`, `name`, `grade`, `streakDays`, `totalQuizzes`, `averageScore`, `timeStudiedHours`, `globalRank`, `totalPoints`, `isDarkTheme`, `lastActiveDateEpochDay` FROM `user_profile`")
        database.execSQL("DROP TABLE `user_profile`")
        database.execSQL("ALTER TABLE `user_profile_new` RENAME TO `user_profile`")

        database.execSQL("CREATE TABLE `quiz_attempts_new` (`ownerUserId` TEXT NOT NULL, `id` TEXT NOT NULL, `quizId` TEXT NOT NULL, `quizTitle` TEXT NOT NULL, `subjectId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `scorePercent` INTEGER NOT NULL, `correctAnswers` INTEGER NOT NULL, `totalQuestions` INTEGER NOT NULL, `timeSpentSeconds` INTEGER NOT NULL, `completedAtEpochMillis` INTEGER NOT NULL, PRIMARY KEY(`id`))")
        database.execSQL("INSERT INTO `quiz_attempts_new` SELECT 'guest', `id`, `quizId`, `quizTitle`, `subjectId`, `unitId`, `scorePercent`, `correctAnswers`, `totalQuestions`, `timeSpentSeconds`, `completedAtEpochMillis` FROM `quiz_attempts`")
        database.execSQL("DROP TABLE `quiz_attempts`")
        database.execSQL("ALTER TABLE `quiz_attempts_new` RENAME TO `quiz_attempts`")
        database.execSQL("CREATE INDEX `index_quiz_attempts_ownerUserId_unitId_completedAtEpochMillis` ON `quiz_attempts` (`ownerUserId`, `unitId`, `completedAtEpochMillis`)")

        database.execSQL("CREATE TABLE `mistakes_new` (`ownerUserId` TEXT NOT NULL, `quizId` TEXT NOT NULL, `questionId` INTEGER NOT NULL, `questionText` TEXT NOT NULL, `selectedAnswer` TEXT NOT NULL, `correctAnswer` TEXT NOT NULL, `subjectId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `explanation` TEXT NOT NULL, `createdAtEpochMillis` INTEGER NOT NULL, `reviewedAtEpochMillis` INTEGER, PRIMARY KEY(`ownerUserId`, `quizId`, `questionId`))")
        database.execSQL("INSERT INTO `mistakes_new` SELECT 'guest', `quizId`, `questionId`, `questionText`, `selectedAnswer`, `correctAnswer`, `subjectId`, `unitId`, `explanation`, `createdAtEpochMillis`, `reviewedAtEpochMillis` FROM `mistakes`")
        database.execSQL("DROP TABLE `mistakes`")
        database.execSQL("ALTER TABLE `mistakes_new` RENAME TO `mistakes`")
        database.execSQL("CREATE INDEX `index_mistakes_ownerUserId_unitId` ON `mistakes` (`ownerUserId`, `unitId`)")

        database.execSQL("CREATE TABLE `recent_activities_new` (`ownerUserId` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `progressPercent` INTEGER NOT NULL, `isCompleted` INTEGER NOT NULL, `iconType` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`))")
        database.execSQL("INSERT INTO `recent_activities_new` SELECT 'guest', `id`, `title`, `subtitle`, `progressPercent`, `isCompleted`, `iconType`, `timestamp` FROM `recent_activities`")
        database.execSQL("DROP TABLE `recent_activities`")
        database.execSQL("ALTER TABLE `recent_activities_new` RENAME TO `recent_activities`")
        database.execSQL("CREATE INDEX `index_recent_activities_ownerUserId_timestamp` ON `recent_activities` (`ownerUserId`, `timestamp`)")

        database.execSQL("CREATE TABLE `flashcard_progress_new` (`ownerUserId` TEXT NOT NULL, `cardId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `isKnown` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`ownerUserId`, `cardId`))")
        database.execSQL("INSERT INTO `flashcard_progress_new` SELECT 'guest', `cardId`, `unitId`, `isKnown`, `updatedAt` FROM `flashcard_progress`")
        database.execSQL("DROP TABLE `flashcard_progress`")
        database.execSQL("ALTER TABLE `flashcard_progress_new` RENAME TO `flashcard_progress`")

        database.execSQL("CREATE TABLE `flashcard_schedules_new` (`ownerUserId` TEXT NOT NULL, `cardId` TEXT NOT NULL, `subjectId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `status` TEXT NOT NULL, `dueAtEpochMillis` INTEGER NOT NULL, `intervalDays` REAL NOT NULL, `ease` REAL NOT NULL, `repetitions` INTEGER NOT NULL, `lapses` INTEGER NOT NULL, `learningStepIndex` INTEGER NOT NULL, `lastReviewedAtEpochMillis` INTEGER, `updatedAtEpochMillis` INTEGER NOT NULL, PRIMARY KEY(`ownerUserId`, `cardId`))")
        database.execSQL("INSERT INTO `flashcard_schedules_new` SELECT 'guest', `cardId`, `subjectId`, `unitId`, `status`, `dueAtEpochMillis`, `intervalDays`, `ease`, `repetitions`, `lapses`, `learningStepIndex`, `lastReviewedAtEpochMillis`, `updatedAtEpochMillis` FROM `flashcard_schedules`")
        database.execSQL("DROP TABLE `flashcard_schedules`")
        database.execSQL("ALTER TABLE `flashcard_schedules_new` RENAME TO `flashcard_schedules`")

        database.execSQL("CREATE TABLE `flashcard_review_logs_new` (`ownerUserId` TEXT NOT NULL, `id` INTEGER NOT NULL, `cardId` TEXT NOT NULL, `unitId` TEXT NOT NULL, `grade` TEXT NOT NULL, `previousStatus` TEXT NOT NULL, `newStatus` TEXT NOT NULL, `previousIntervalDays` REAL NOT NULL, `newIntervalDays` REAL NOT NULL, `reviewedAtEpochMillis` INTEGER NOT NULL, PRIMARY KEY(`id`))")
        database.execSQL("INSERT INTO `flashcard_review_logs_new` SELECT 'guest', `id`, `cardId`, `unitId`, `grade`, `previousStatus`, `newStatus`, `previousIntervalDays`, `newIntervalDays`, `reviewedAtEpochMillis` FROM `flashcard_review_logs`")
        database.execSQL("DROP TABLE `flashcard_review_logs`")
        database.execSQL("ALTER TABLE `flashcard_review_logs_new` RENAME TO `flashcard_review_logs`")
        database.execSQL("CREATE INDEX `index_flashcard_review_logs_ownerUserId_reviewedAtEpochMillis` ON `flashcard_review_logs` (`ownerUserId`, `reviewedAtEpochMillis`)")
    }
}
