package com.chat.designsystem.component.textfield

import androidx.compose.foundation.layout.PaddingValues
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

@Composable
fun InviteTextField(modifier: Modifier = Modifier) {
    var value by remember { mutableStateOf("") }

    GoSocketTextField(
        modifier = modifier,
        value = value,
        placeholder = "Email",
        backgroundColor = Color(0x14000000),
        backgroundShape = RoundedCornerShape(8.dp),
        contentPadding = PaddingValues(horizontal = 14.dp, vertical = 9.dp),
        onValueChange = { value = it },
    )
}

@Preview(showBackground = true)
@Composable
fun InviteTextFieldPreview() {
    InviteTextField()
}
