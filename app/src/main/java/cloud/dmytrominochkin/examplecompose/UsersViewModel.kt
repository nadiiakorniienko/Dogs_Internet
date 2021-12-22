package cloud.dmytrominochkin.examplecompose

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import cloud.dmytrominochkin.examplecompose.model.User
import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class UsersViewModel : ViewModel() {
    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    private val client = HttpClient(OkHttp) {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    init {
        getAll()
    }

    private fun getAll() {
        viewModelScope.launch {
            try {
                val response = client.get<List<User>>("$BASE_URL/dogs")
                _users.update { response }
            } catch (e: Exception) {
                _users.update { emptyList() }
            }
        }
    }

    fun getById(id: Int) = users.value.first { it.id == id }

    companion object {
        const val BASE_URL = "https://usersdogs-ip4weamexa-ew.a.run.app"
    }
}
