package edu.wololo.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import edu.wololo.data.repository.TodoItemsRepository
import edu.wololo.data.repository.TodoItemsRepositoryImpl

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    internal abstract fun bindsTodoItemsRepository(
        implRepository: TodoItemsRepositoryImpl
    ): TodoItemsRepository
}