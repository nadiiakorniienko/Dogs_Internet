package cloud.dmytrominochkin.examplecompose.ui.user

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cloud.dmytrominochkin.examplecompose.R
import cloud.dmytrominochkin.examplecompose.model.User
import cloud.dmytrominochkin.examplecompose.ui.theme.ExampleComposeTheme
import androidx.compose.material.Divider
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.Card
import cloud.dmytrominochkin.examplecompose.UsersViewModel
import coil.compose.rememberImagePainter

@Composable
fun UserCard(user: User,
             onClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        //backgroundColor = graySurface,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
    ) {
        Row(
            Modifier
                .clickable (onClick = onClick)
        ) {
            Image(user)
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = user.title, style = MaterialTheme.typography.h6)
                Text(text = user.sex, style = MaterialTheme.typography.caption)
            }
        }
    }
}

@Composable
private fun Image(user: User) {
    Image(
        painter = rememberImagePainter(data = "${UsersViewModel.BASE_URL}${user.dogImage}"),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}

/*@Preview
@Composable
fun UserCardPreview() {
    val user = User(
        "1",
        "Cat",
        "Male",
        3,
        "er",
        R.drawable.avatar_1
    )
    ExampleComposeTheme {
        Surface {
            UserCard(user, {})
        }
    }
}*/
