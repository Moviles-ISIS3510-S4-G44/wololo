package edu.wololo.database.model

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "todo_items")
data class TodoItemEntity(
    @PrimaryKey val id: String
)