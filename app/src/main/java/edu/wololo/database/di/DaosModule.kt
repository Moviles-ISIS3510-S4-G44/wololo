package edu.wololo.database.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.wololo.database.TodoAppDatabase
import edu.wololo.database.dao.TodoItemsDao

@Module
@InstallIn(SingletonComponent::class)
internal object DaosModule {
    @Provides
    fun providesTodoItemsDao(
        database: TodoAppDatabase,
    ): TodoItemsDao = database.todoItemsDao()
}