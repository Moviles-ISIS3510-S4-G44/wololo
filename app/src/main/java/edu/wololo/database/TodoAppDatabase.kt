package edu.wololo.database

import androidx.room3.Database
import androidx.room3.RoomDatabase
import edu.wololo.database.dao.TodoItemsDao

@Database(entities = [TodoItemsDao::class], version = 1, exportSchema = true)
internal abstract class TodoAppDatabase : RoomDatabase() {
    abstract fun todoItemsDao(): TodoItemsDao
}