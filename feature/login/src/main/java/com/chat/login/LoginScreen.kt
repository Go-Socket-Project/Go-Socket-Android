package com.chat.login

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcGoogle
import com.chat.designsystem.theme.IcLogo
import com.chat.designsystem.theme.Typography

@Composable
internal fun LoginRoute(onLoginClick: () -> Unit) {
    LoginScreen(onLoginClick)
}

@Composable
private fun LoginScreen(onLoginClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF0F4F8))
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column(
            modifier = Modifier
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(15.dp)
                )
                .padding(
                    top = 40.dp,
                    start = 33.dp,
                    end = 33.dp,
                    bottom = 54.dp
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            IcLogo()
            Text(
                modifier = Modifier.padding(
                    top = 24.dp,
                    bottom = 8.dp
                ),
                text = stringResource(id = R.string.app_name),
                style = Typography.b1,
                color = Color.Black
            )
            Text(
                text = stringResource(id = R.string.app_introduce),
                style = Typography.m1,
                color = Color.Black
            )
            OutlinedButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 140.dp),
                border = BorderStroke(
                    width = 1.dp,
                    color = Color(0x3B1E2432)
                ),
                shape = RoundedCornerShape(8.dp),
                onClick = { onLoginClick() }
            ) {
                IcGoogle()
                Text(
                    modifier = Modifier.padding(start = 8.dp),
                    text = stringResource(id = R.string.google_login),
                    style = Typography.b4,
                    color = Color(0x8A000000)
                )
            }
        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen {}
}