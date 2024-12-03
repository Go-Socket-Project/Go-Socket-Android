package com.chat.designsystem.component.textfield

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.N5

@Composable
fun InviteTextField(
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(8.dp)
) {
    var value by remember { mutableStateOf("") }

    GoSocketTextField(
        modifier = modifier,
        value = value,
        placeholder = "받는사람 : 검색하기",
        backgroundColor = N5,
        backgroundShape = RoundedCornerShape(8.dp),
        contentPadding = contentPadding,
        onValueChange = { value = it },
    )
}

@Preview(showBackground = true)
@Composable
fun InviteTextFieldPreview() {
    InviteTextField()
}
