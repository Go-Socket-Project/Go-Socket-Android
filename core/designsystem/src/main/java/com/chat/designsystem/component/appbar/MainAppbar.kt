package com.chat.designsystem.component.appbar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.R
import com.chat.designsystem.theme.IcHamburger
import com.chat.designsystem.theme.IcLogo
import com.chat.designsystem.theme.Typography
import com.chat.designsystem.util.clickableNoRipple
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun MainAppbar(
    modifier: Modifier = Modifier,
    imageUrl: String = "",
    onClickIcHamburger: () -> Unit = {},
    onClickIcProfile: () -> Unit = {},
) {
    GoSocketAppbar(
        modifier = modifier,
        padding = PaddingValues(
            horizontal = 20.dp,
            vertical = 16.dp
        )
    ) {
        IcHamburger(
            modifier = Modifier.clickableNoRipple { onClickIcHamburger() }
        )
        IcLogo(Modifier.size(24.dp))
        Text(
            text = "Chat",
            style = Typography.h1,
            color = Color.Black
        )
        Spacer(modifier = Modifier.weight(1f))
        GlideImage(
            modifier = Modifier
                .size(24.dp)
                .clickableNoRipple { onClickIcProfile() },
            imageModel = { imageUrl }, // loading a network image using an URL.
            imageOptions = ImageOptions(
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center
            ),
            previewPlaceholder = painterResource(id = R.drawable.icon_green_profile),
            loading = {
                Box(modifier = Modifier.matchParentSize()) {
                    CircularProgressIndicator(
                        modifier = Modifier.align(Alignment.Center)
                    )
                }
            },
            failure = {
                Text(text = "image request failed.")
            }
        )
    }
}

@Preview
@Composable
fun MainAppbarPreview() {
    MainAppbar()
}
