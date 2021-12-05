package cloud.dmytrominochkin.examplecompose.ui.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.Card
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cloud.dmytrominochkin.examplecompose.R
import cloud.dmytrominochkin.examplecompose.model.User
import cloud.dmytrominochkin.examplecompose.ui.theme.ExampleComposeTheme
import androidx.compose.material.Divider
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.ui.unit.Dp
import org.intellij.lang.annotations.JdkConstants

@Composable
fun ProfileHeader(
    user: User
) {
    val heightIn = 320.dp
    val padding = 8.dp
    Column(
        modifier = Modifier
            .padding(start = 8.dp, end = 8.dp, bottom = 8.dp, top = 0.dp)
    ) {
        Image(
            modifier = Modifier
                .heightIn(max = heightIn)
                .fillMaxWidth(),
            painter = painterResource(id = user.avatar),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )

        Text(
            text = user.name,
            style = MaterialTheme.typography.h6
        )
        Divider(color = Color.White, thickness = 1.dp)
        Text(
            text = "Sex",
            style = MaterialTheme.typography.caption
        )
        Text(
            text = user.sex,
            style = MaterialTheme.typography.h6
        )
        Divider(color = Color.White, thickness = 1.dp)
        Text(
            text = "Age",
            style = MaterialTheme.typography.caption
        )
        Text(
            text = user.age,
            style = MaterialTheme.typography.h6
        )
        Divider(color = Color.White, thickness = 1.dp)
        Text(
            text = "Personality",
            style = MaterialTheme.typography.caption
        )
        Text(
            text = user.personality,
            style = MaterialTheme.typography.h6
        )
        Divider(color = Color.White, thickness = 1.dp)
        Spacer(Modifier.size(padding))

        Column(
            //horizontalAlignment = Alignment.BottomEnd,
            modifier = Modifier
                .padding(start = 180.dp, end = 8.dp, bottom = 8.dp, top = 16.dp)
                .heightIn(max = 60.dp)
                .widthIn(max = 180.dp),
        ) {
            Button(
                onClick = {},
                shape = CircleShape)
            {
                Image(
                    painter = painterResource(R.drawable.phone),
                    modifier = Modifier
                        .size(40.dp),
                    contentDescription = "phone",
                    contentScale = ContentScale.Crop
                )
                Spacer(Modifier.size(padding))
                Text("Adopt Me")
            }
        }
    }
}

@Composable
fun ProfileScreen(user: User) {

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    ProfileHeader(
                        user,
                    )
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
        "Cat",
        R.drawable.avatar_2,
        "Male",
        "4",
        "info"
    )
    ExampleComposeTheme {
        Surface {
            ProfileHeader(user = user)
        }
    }
}


