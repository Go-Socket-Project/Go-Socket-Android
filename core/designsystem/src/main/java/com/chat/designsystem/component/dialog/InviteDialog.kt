package com.chat.designsystem.component.dialog

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
import com.chat.designsystem.component.textfield.InviteTextField
import com.chat.designsystem.theme.IcSmallX
import com.chat.designsystem.theme.Typography
import com.chat.designsystem.util.clickableNoRipple

@Composable
fun InviteDialog(
    modifier: Modifier = Modifier,
    properties: DialogProperties = DialogProperties(),
    onDismissRequest: () -> Unit = {},
    onInvite: () -> Unit = {},
) {
    GoSocketDialog(
        properties = properties,
        onDismissRequest = onDismissRequest,
        onButtonClicked = onInvite,
    ) {
        Box(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {
            IcSmallX(
                modifier = Modifier
                    .size(22.dp)
                    .align(Alignment.TopEnd)
                    .clickableNoRipple { onDismissRequest() }
            )
            Text(
                modifier = Modifier
                    .padding(top = 18.dp)
                    .align(Alignment.TopCenter),
                text = "상대방 이메일을 입력해주세요",
                style = Typography.b4,
                color = Color(0xFF15114D)
            )
        }

        Row(modifier = Modifier.padding(horizontal = 20.dp, vertical = 32.dp)) {
            InviteTextField()
        }
    }
}

@Preview
@Composable
fun InviteDialogPreview() {
    InviteDialog()
}
