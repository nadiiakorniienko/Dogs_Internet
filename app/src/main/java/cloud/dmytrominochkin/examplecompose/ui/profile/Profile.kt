package cloud.dmytrominochkin.examplecompose.ui.profile

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cloud.dmytrominochkin.examplecompose.R
import cloud.dmytrominochkin.examplecompose.model.User
import cloud.dmytrominochkin.examplecompose.ui.components.RoundedHeader
import cloud.dmytrominochkin.examplecompose.ui.theme.ExampleComposeTheme

@Composable
fun Profile(user: User, modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colors.onSurface,
        contentColor = MaterialTheme.colors.surface
    ) {
            Column(Modifier.padding(top = 24.dp)) {
                Spacer(modifier = Modifier.weight(1f))
                ProfileHeader(user)
                Spacer(modifier = Modifier.weight(1f))
            }
    }
}

/*
@Preview(widthDp = 200)
@Composable
fun TagPreview() {
    */
/*val user = User(
        "1",
        "Cat",
        R.drawable.avatar_1,
        "Male",
        "3",
        "info"
    )*//*

    ExampleComposeTheme {
        Surface {
        }
    }
}*/
