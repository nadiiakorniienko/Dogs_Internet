package cloud.dmytrominochkin.examplecompose.model

data class User(
    val id: String,
    val name: String,
    val lastOnline: String,
    val avatar: Int,
    val coverImage: Int,
    val numOfFollowers: String,
    val numOfFollowing: String,
    val tags: List<String>,
    val photos: Map<String, List<Int>>
)