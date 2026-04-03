package edu.wololo.data.repository

import edu.wololo.data.model.TodoItem
import edu.wololo.database.dao.TodoItemsDao
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import java.util.UUID

internal class TodoItemsRepositoryImpl @Inject constructor(
    private val todoItemsDao: TodoItemsDao
) : TodoItemsRepository {
    override fun getTodoItem(id: UUID): Flow<TodoItem> {
        TODO("Not yet implemented")
    }
}