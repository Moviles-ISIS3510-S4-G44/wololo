package edu.wololo.data.repository

import edu.wololo.data.model.TodoItem
import kotlinx.coroutines.flow.Flow
import java.util.UUID

interface TodoItemsRepository {
    fun getTodoItem(id: UUID): Flow<TodoItem>
}