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
import cloud.dmytrominochkin.examplecompose.model.User
import cloud.dmytrominochkin.examplecompose.ui.components.StatusBarColorProvider
import cloud.dmytrominochkin.examplecompose.ui.feed.Feed
import cloud.dmytrominochkin.examplecompose.ui.profile.Profile

@ExperimentalAnimationApi
@Composable
fun MainScreen() {
    StatusBarColorProvider()
    Surface(color = MaterialTheme.colors.onSurface) {
        var selectedId by rememberSaveable { mutableStateOf<String?>(null) }
        Crossfade(targetState = selectedId) { id ->
            if (id == null) {
                Feed(
                    users,
                    onSelected = { selectedId = it.id }
                )
            } else {
                Profile(users.first { it.id == id })
                BackHandler {
                    selectedId = null
                }
            }
        }
    }
}

private val users = mutableListOf(
    User(
        "1",
        "Ivanna Ivanova",
        "3 minutes ago",
        R.drawable.avatar_1,
        R.drawable.image_1,
        "100K",
        "1.5K",
        listOf("food", "fashion", "nature", "dogs", "people", "selfies", "style", "fashion", "cats"),
        mapOf(
            "Today" to listOf(
                R.drawable.user1_1,
                R.drawable.user1_2,
                R.drawable.user1_3,
                R.drawable.user1_4,
                R.drawable.user1_5,
                R.drawable.user1_6
            ),
            "Hobby" to listOf(
                R.drawable.user2_1,
                R.drawable.user2_2,
                R.drawable.user2_3,
                R.drawable.user2_4,
                R.drawable.user2_5,
                R.drawable.user2_6
            )
        )
    ),
    User(
        "2",
        "Mary Jane",
        "10 minutes ago",
        R.drawable.avatar_2,
        R.drawable.image_2,
        "20K",
        "999",
        listOf("people", "selfies", "style", "fashion"),
        mapOf(
            "Vacation" to listOf(
                R.drawable.user1_1,
                R.drawable.user1_2,
                R.drawable.user1_3,
                R.drawable.user1_4,
                R.drawable.user1_5,
                R.drawable.user1_6
            ),
            "Today" to listOf(
                R.drawable.user2_1,
                R.drawable.user2_2,
                R.drawable.user2_3,
                R.drawable.user2_4,
                R.drawable.user2_5,
                R.drawable.user2_6
            ),
            "Inspiration" to listOf(
                R.drawable.user3_1,
                R.drawable.user3_2,
                R.drawable.user3_3,
                R.drawable.user3_4,
                R.drawable.user3_5,
                R.drawable.user3_6
            )
        )
    ),
    User(
        "3",
        "Tess Tickle",
        "1 day ago",
        R.drawable.avatar_3,
        R.drawable.image_3,
        "69K",
        "420",
        listOf("selife", "cats", "nature", "fashion"),
        mapOf(
            "Life" to listOf(
                R.drawable.user3_1,
                R.drawable.user3_2,
                R.drawable.user3_3,
                R.drawable.user3_4,
                R.drawable.user3_5,
                R.drawable.user3_6
            ),
            "Hobby" to listOf(
                R.drawable.user1_1,
                R.drawable.user1_2,
                R.drawable.user1_3,
                R.drawable.user1_4,
                R.drawable.user1_5,
                R.drawable.user1_6
            )
        )
    )
)