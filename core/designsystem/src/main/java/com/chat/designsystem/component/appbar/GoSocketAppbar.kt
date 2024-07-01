package com.chat.designsystem.component.appbar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.icon.IcHamburger
import com.chat.designsystem.icon.IcLogo
import com.chat.designsystem.icon.IcProfile
import com.chat.designsystem.theme.Typography
import com.chat.designsystem.util.clickableNoRipple

@Composable
fun GoSocketAppbar(
    modifier: Modifier = Modifier,
    isState: String = "Offline",
    onClickIcHamburger: () -> Unit = {},
    onClickIcProfile: () -> Unit = {},
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color.White)
            .padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IcHamburger(Modifier.clickableNoRipple { onClickIcHamburger() })
        IcLogo(Modifier.size(24.dp))
        Text(
            text = "Chat",
            style = Typography.h1,
            color = Color.Black
        )
        Spacer(modifier = Modifier.weight(1f))
        IcProfile(
            modifier = Modifier
                .size(24.dp)
                .clickableNoRipple { onClickIcProfile() },
            isState = isState
        )
    }
}

@Preview
@Composable
fun GoSocketAppbarPreview() {
    GoSocketAppbar()
}