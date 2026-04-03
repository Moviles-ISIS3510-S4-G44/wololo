package edu.wololo.database.di

import android.content.Context
import androidx.room3.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import edu.wololo.database.TodoAppDatabase
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal object DatabaseModule {
    @Provides
    @Singleton
    fun provideTodoAppDatabase(@ApplicationContext context: Context): TodoAppDatabase =
        Room.databaseBuilder(
            context, TodoAppDatabase::class.java, "todo-app-database"
        ).setDriver(BundledSQLiteDriver()).build()
}