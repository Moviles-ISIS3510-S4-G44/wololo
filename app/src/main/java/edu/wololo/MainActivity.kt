package edu.wololo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.NavKey
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import dagger.hilt.android.AndroidEntryPoint
import edu.wololo.ui.theme.WololoTheme
import kotlinx.serialization.Serializable
import kotlin.uuid.Uuid

@Serializable
data object TodoItemsHome : NavKey

@Serializable
data class TodoItemsDetail(val id: Uuid) : NavKey


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WololoTheme {
                val backStack = rememberNavBackStack(TodoItemsDetail(Uuid.random()))
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavDisplay(
                        entryDecorators = listOf(
                            rememberSaveableStateHolderNavEntryDecorator(),
                            rememberViewModelStoreNavEntryDecorator()
                        ), backStack = backStack, entryProvider = entryProvider {
                            entry<TodoItemsHome> {
                                Greeting(
                                    name = "leeroy", modifier = Modifier.padding(innerPadding)
                                )
                            }
                            entry<TodoItemsDetail> { key ->
                                Greeting(
                                    name = "leeroy detail ${key.id}",
                                    modifier = Modifier.padding(innerPadding)
                                )
                            }
                        })
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!", modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WololoTheme {
        Greeting("Android")
    }
}