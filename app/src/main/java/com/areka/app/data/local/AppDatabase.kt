package com.areka.app.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        UserProfileEntity::class,
        RecentActivityEntity::class,
        FlashcardProgressEntity::class,
        FlashcardScheduleEntity::class,
        ReviewLogEntity::class,
        QuizAttemptEntity::class,
        MistakeEntity::class
    ],
    version = 6,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userProfileDao(): UserProfileDao
    abstract fun recentActivityDao(): RecentActivityDao
    abstract fun flashcardProgressDao(): FlashcardProgressDao
    abstract fun flashcardScheduleDao(): FlashcardScheduleDao
    abstract fun studyDao(): StudyDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "areka_study_db"
                )
                    .addMigrations(MIGRATION_3_4, MIGRATION_4_5, MIGRATION_5_6)
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
