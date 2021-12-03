package cloud.dmytrominochkin.examplecompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cloud.dmytrominochkin.examplecompose.model.User
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel() {
    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    fun getById(id: String) = users.value.first { it.id == id }

    init {
        _users.value = mutableListOf(
            User(
                "1",
                "Ivanna Ivanova",
                "3 minutes ago",
                R.drawable.avatar_1,
                R.drawable.image_1,
                "100K",
                "1.5K",
                listOf(
                    "food",
                    "fashion",
                    "nature",
                    "dogs",
                    "people",
                    "selfies",
                    "style",
                    "fashion",
                    "cats"
                ),
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
        viewModelScope.launch {
            delay(5000)
            _users.value = mutableListOf(
                User(
                    "1",
                    "Ivanna Ivanova",
                    "10 minutes ago",
                    R.drawable.avatar_1,
                    R.drawable.image_1,
                    "100K",
                    "1.5K",
                    listOf(
                        "food",
                        "fashion",
                        "nature",
                        "dogs",
                        "people",
                        "selfies",
                        "style",
                        "fashion",
                        "cats"
                    ),
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
                )
            )
            delay(5000)
            _users.value = mutableListOf(
                User(
                    "1",
                    "Ivanna Ivanova",
                    "3 minutes ago",
                    R.drawable.avatar_1,
                    R.drawable.image_1,
                    "100K",
                    "1.5K",
                    listOf(
                        "food",
                        "fashion",
                        "nature",
                        "dogs",
                        "people",
                        "selfies",
                        "style",
                        "fashion",
                        "cats"
                    ),
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
        }
    }
}