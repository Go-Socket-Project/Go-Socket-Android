package com.chat.login

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.chat.designsystem.icon.IcLogo

@Composable
fun LoginScreen() {
    Column {
        IcLogo()
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}