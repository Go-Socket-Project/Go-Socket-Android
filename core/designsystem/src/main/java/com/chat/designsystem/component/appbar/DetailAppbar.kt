package com.chat.designsystem.component.appbar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcArrowLeft
import com.chat.designsystem.theme.Typography
import com.chat.designsystem.util.clickableNoRipple

@Composable
fun DetailAppbar(
    modifier: Modifier = Modifier,
    description: String = "Description",
    onClickIcArrowLeft: () -> Unit = {},
) {
    GoSocketAppbar(
        modifier = modifier,
        padding = PaddingValues(
            horizontal = 20.dp,
            vertical = 16.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        IcArrowLeft(
            modifier = Modifier.clickableNoRipple { onClickIcArrowLeft() }
        )
        Text(
            text = description,
            style = Typography.b3,
            color = Color.Black
        )
    }
}

@Preview
@Composable
fun DetailAppbarPreview() {
    DetailAppbar()
}