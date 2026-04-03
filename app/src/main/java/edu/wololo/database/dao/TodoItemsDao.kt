package edu.wololo.database.dao

import androidx.paging.PagingSource
import androidx.room3.Dao
import androidx.room3.DaoReturnTypeConverters
import androidx.room3.Query
import androidx.room3.paging.PagingSourceDaoReturnTypeConverter
import edu.wololo.database.model.TodoItemEntity

@Dao
@DaoReturnTypeConverters(PagingSourceDaoReturnTypeConverter::class)
interface TodoItemsDao {
    @Query("SELECT * FROM todo_items")
    fun getTodoItems(): PagingSource<Int, TodoItemEntity>
}