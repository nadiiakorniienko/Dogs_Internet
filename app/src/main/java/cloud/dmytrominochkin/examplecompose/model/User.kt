package cloud.dmytrominochkin.examplecompose.model

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: Int,
    val title: String,
    val sex: String,
    val age: Int,
    val description: String,
    val dogImage: String,
)