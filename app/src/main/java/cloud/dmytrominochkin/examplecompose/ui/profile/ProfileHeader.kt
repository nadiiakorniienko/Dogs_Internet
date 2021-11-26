package cloud.dmytrominochkin.examplecompose.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cloud.dmytrominochkin.examplecompose.R
import cloud.dmytrominochkin.examplecompose.model.User
import cloud.dmytrominochkin.examplecompose.ui.theme.ExampleComposeTheme

@Composable
fun ProfileHeader(user: User) {
    val padding = 16.dp

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = padding, end = padding),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(user.avatar),
            modifier = Modifier
                .size(72.dp)
                .clip(CircleShape),
            contentDescription = "avatar",
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.size(padding))
        Column(Modifier.weight(1f)) {
            Text(
                text = user.name,
                style = MaterialTheme.typography.h6
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                FollowingInfo(text = "followers", number = user.numOfFollowers)
                FollowingInfo(text = "following", number = user.numOfFollowing)
                Button(onClick = {}, shape = CircleShape) {
                    Text("Follow")
                }
            }
        }
    }
}

@Preview
@Composable
fun ProfileHeaderPreview() {
    val user = User(
        "2",
        "Mary Jane",
        "5 minutes ago",
        R.drawable.avatar_2,
        R.drawable.image_2,
        "10",
        "5",
        emptyList(),
        emptyMap()
    )
    ExampleComposeTheme {
        Surface {
            ProfileHeader(user = user)
        }
    }
}