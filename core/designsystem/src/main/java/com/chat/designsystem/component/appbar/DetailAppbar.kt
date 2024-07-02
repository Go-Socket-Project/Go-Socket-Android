package com.chat.designsystem.component.appbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.icon.IcArrowLeft
import com.chat.designsystem.theme.Typography
import com.chat.designsystem.util.clickableNoRipple

@Composable
fun DetailAppbar(
    modifier: Modifier = Modifier,
    description: String = "Description",
    onClickIcArrowLeft: () -> Unit = {},
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color.White)
            .padding(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IcArrowLeft(Modifier.clickableNoRipple { onClickIcArrowLeft() })
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