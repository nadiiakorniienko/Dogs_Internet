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
                "Kitty",
                R.drawable.avatar_1,
                "Female",
                "1",
                "I like to sleep and purr."
            ),
            User(
                "2",
                "Jackie",
                R.drawable.avatar_2,
                "Male",
                "3",
                "I`m crazy and funny."
            ),
            User(
                "3",
                "Barsik",
                R.drawable.avatar_3,
                "Male",
                "5",
                "I don`t like being touched."
            ),
            User(
                "4",
                "Jessie",
                R.drawable.avatar_4,
                "Female",
                "6",
                "I like fish so much."
            ),
            User(
                "5",
                "Blackie",
                R.drawable.avatar_5,
                "Male",
                "3",
                "I like to cross people`s path."
            )
        )
        viewModelScope.launch {
            delay(5000)
            _users.value = mutableListOf(
                User(
                    "1",
                    "Kitty",
                    R.drawable.avatar_1,
                    "Female",
                    "1",
                    "I like to sleep and purr."
                ),
                User(
                    "2",
                    "Jackie",
                    R.drawable.avatar_2,
                    "Male",
                    "3",
                    "I`m crazy and funny."
                ),
                User(
                    "3",
                    "Barsik",
                    R.drawable.avatar_3,
                    "Male",
                    "5",
                    "I don`t like being touched."
                ),
                User(
                    "4",
                    "Jessie",
                    R.drawable.avatar_4,
                    "Female",
                    "6",
                    "I like fish so much."
                ),
                User(
                    "5",
                    "Blackie",
                    R.drawable.avatar_5,
                    "Male",
                    "3",
                    "I like to cross people`s path."
                )
            )
            delay(5000)
            _users.value = mutableListOf(
                User(
                    "1",
                    "Kitty",
                    R.drawable.avatar_1,
                    "Female",
                    "1",
                    "I like to sleep and purr."
                ),
                User(
                    "2",
                    "Jackie",
                    R.drawable.avatar_2,
                    "Male",
                    "3",
                    "I`m crazy and funny."
                ),
                User(
                    "3",
                    "Barsik",
                    R.drawable.avatar_3,
                    "Male",
                    "5",
                    "I don`t like being touched."
                ),
                User(
                    "4",
                    "Jessie",
                    R.drawable.avatar_4,
                    "Female",
                    "6",
                    "I like fish so much."
                ),
                User(
                    "5",
                    "Blackie",
                    R.drawable.avatar_5,
                    "Male",
                    "3",
                    "I like to cross people`s path."
                )
            )
        }
    }
}