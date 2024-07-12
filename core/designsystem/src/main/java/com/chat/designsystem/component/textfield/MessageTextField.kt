package com.chat.designsystem.component.textfield

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcSend
import com.chat.designsystem.util.clickableNoRipple

@Composable
fun MessageTextField(
    modifier: Modifier = Modifier,
    onSendClicked: () -> Unit = {},
) {
    var value by remember { mutableStateOf("") }

    GoSocketTextField(
        modifier = modifier,
        value = value,
        placeholder = "Your message",
        backgroundColor = Color(0xFFF2F2F4),
        trailingIconColor = Color(0xFF656B80),
        backgroundShape = RoundedCornerShape(16.dp),
        onValueChange = { value = it },
        trailingIcon = {
            IcSend(
                modifier = Modifier.clickableNoRipple { onSendClicked() },
                tint = it
            )
        },
    )
}

@Preview
@Composable
fun MessageTextFieldPreview() {
    MessageTextField()
}