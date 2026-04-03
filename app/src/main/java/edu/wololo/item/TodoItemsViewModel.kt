package edu.wololo.item

import androidx.lifecycle.ViewModel
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.wololo.data.repository.TodoItemsRepository
import kotlin.uuid.Uuid

@HiltViewModel(assistedFactory = TodoItemsViewModel.Factory::class)
class TodoItemsViewModel @AssistedInject constructor(
    private val todoItemsRepository: TodoItemsRepository,
    @Assisted val itemId: Uuid,
) : ViewModel() {
    @AssistedFactory
    interface Factory {
        fun create(
            itemId: Uuid,
        ): TodoItemsViewModel
    }
}