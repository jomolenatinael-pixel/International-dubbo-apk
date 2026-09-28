package com.areka.app.data.local

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

/** Adds the learning-attempt tables introduced after the original version 3 schema. */
val MIGRATION_3_4 = object : Migration(3, 4) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `quiz_attempts` (
                `id` TEXT NOT NULL,
                `quizId` TEXT NOT NULL,
                `quizTitle` TEXT NOT NULL,
                `subjectId` TEXT NOT NULL,
                `unitId` TEXT NOT NULL,
                `scorePercent` INTEGER NOT NULL,
                `correctAnswers` INTEGER NOT NULL,
                `totalQuestions` INTEGER NOT NULL,
                `timeSpentSeconds` INTEGER NOT NULL,
                `completedAtEpochMillis` INTEGER NOT NULL,
                PRIMARY KEY(`id`)
            )
            """.trimIndent()
        )
        database.execSQL(
            "CREATE INDEX IF NOT EXISTS `index_quiz_attempts_unitId_completedAtEpochMillis` " +
                "ON `quiz_attempts` (`unitId`, `completedAtEpochMillis`)"
        )
        // Version 4 used a generated string id. Keep that schema here so 3->4->5 is valid.
        database.execSQL(
            """
            CREATE TABLE IF NOT EXISTS `mistakes` (
                `id` TEXT NOT NULL,
                `quizId` TEXT NOT NULL,
                `questionId` INTEGER NOT NULL,
                `questionText` TEXT NOT NULL,
                `selectedAnswer` TEXT NOT NULL,
                `correctAnswer` TEXT NOT NULL,
                `subjectId` TEXT NOT NULL,
                `unitId` TEXT NOT NULL,
                `explanation` TEXT NOT NULL,
                `createdAtEpochMillis` INTEGER NOT NULL,
                `reviewedAtEpochMillis` INTEGER,
                PRIMARY KEY(`id`)
            )
            """.trimIndent()
        )
    }
}

/** Re-keys mistakes by their stable quiz/question identity and removes duplicate rows. */
val MIGRATION_4_5 = object : Migration(4, 5) {
    override fun migrate(database: SupportSQLiteDatabase) {
        database.execSQL(
            """
            CREATE TABLE `mistakes_new` (
                `quizId` TEXT NOT NULL,
                `questionId` INTEGER NOT NULL,
                `questionText` TEXT NOT NULL,
                `selectedAnswer` TEXT NOT NULL,
                `correctAnswer` TEXT NOT NULL,
                `subjectId` TEXT NOT NULL,
                `unitId` TEXT NOT NULL,
                `explanation` TEXT NOT NULL,
                `createdAtEpochMillis` INTEGER NOT NULL,
                `reviewedAtEpochMillis` INTEGER,
                PRIMARY KEY(`quizId`, `questionId`)
            )
            """.trimIndent()
        )
        database.execSQL(
            """
            INSERT OR REPLACE INTO `mistakes_new`
            (`quizId`, `questionId`, `questionText`, `selectedAnswer`, `correctAnswer`,
             `subjectId`, `unitId`, `explanation`, `createdAtEpochMillis`, `reviewedAtEpochMillis`)
            SELECT `quizId`, `questionId`, `questionText`, `selectedAnswer`, `correctAnswer`,
                   `subjectId`, `unitId`, `explanation`, `createdAtEpochMillis`, `reviewedAtEpochMillis`
            FROM `mistakes`
            ORDER BY `createdAtEpochMillis` ASC
            """.trimIndent()
        )
        database.execSQL("DROP TABLE `mistakes`")
        database.execSQL("ALTER TABLE `mistakes_new` RENAME TO `mistakes`")
        database.execSQL("CREATE INDEX `index_mistakes_unitId` ON `mistakes` (`unitId`)")
    }
}
