package edu.wololo.item

import androidx.compose.runtime.Composable
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@Composable
fun TodoItemsScreen(
    viewModel: TodoItemsViewModel = hiltViewModel()
): Unit {
}