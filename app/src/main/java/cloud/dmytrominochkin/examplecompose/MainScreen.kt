package cloud.dmytrominochkin.examplecompose

import androidx.activity.compose.BackHandler
import androidx.compose.animation.Crossfade
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.viewmodel.compose.viewModel
import cloud.dmytrominochkin.examplecompose.model.User
import cloud.dmytrominochkin.examplecompose.ui.components.StatusBarColorProvider
import cloud.dmytrominochkin.examplecompose.ui.feed.Feed
import cloud.dmytrominochkin.examplecompose.ui.profile.Profile

@ExperimentalAnimationApi
@Composable
fun MainScreen() {
    StatusBarColorProvider()
    Surface(color = MaterialTheme.colors.onSurface) {
        var selectedId by rememberSaveable { mutableStateOf<Int?>(null) }
        val viewModel = viewModel<UsersViewModel>()
        Crossfade(targetState = selectedId) { id ->
            if (id == null) {
                Feed(
                    viewModel.users,
                    onSelected = { selectedId = it.id }
                )
            } else {
                Profile(viewModel.getById(id))
                BackHandler {
                    selectedId = null
                }
            }
        }
    }
}