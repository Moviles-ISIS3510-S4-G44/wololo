package edu.wololo.data.model

import kotlin.time.Instant
import kotlin.uuid.Uuid

data class TodoItem(
    val id: Uuid,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
    val createdAt: Instant,
    val updatedAt: Instant,
)
