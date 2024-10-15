package com.chat.designsystem.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcCreateDirectMessage

@Composable
fun InviteFriendButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    GoSocketButton(
        modifier = modifier,
        text = "친구 추가하기",
        shape = RoundedCornerShape(30.dp),
        border = BorderStroke(1.dp, Color(0x3B1E2432)),
        onClick = onClick,
    ) { IcCreateDirectMessage(modifier = Modifier.size(22.dp, 18.dp), tint = Color.White) }
}

@Preview
@Composable
fun InviteFriendButtonPreview() {
    InviteFriendButton {}
}
