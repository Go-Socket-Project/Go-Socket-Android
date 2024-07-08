package com.chat.designsystem.component.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogProperties
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
    var text by remember { mutableStateOf("") }
    val focusRequester by remember { mutableStateOf(FocusRequester()) }
    var isFocus by remember { mutableStateOf(false) }

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

        BasicTextField(  // 추 후에 TextField로 따로 퍼블리싱 필요
            modifier = modifier
                .fillMaxWidth()
                .padding(
                    horizontal = 20.dp,
                    vertical = 32.dp
                )
                .background(
                    color = Color(0x14000000),
                    shape = RoundedCornerShape(8.dp)
                )
                .focusRequester(focusRequester)
                .onFocusChanged {
                    isFocus = it.isFocused
                },
            value = text,
            onValueChange = { text = it },
            textStyle = Typography.m4.copy(color = Color.Black),
            singleLine = true,
            maxLines = 1,
            visualTransformation = VisualTransformation.None,
            keyboardOptions = KeyboardOptions.Default,
            decorationBox = { innerTextField ->
                Box(
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp, vertical = 15.dp)
                ) {
                    if (text.isEmpty()) {
                        Text(
                            text = "placeholder",
                            style = Typography.m4,
                            color = Color(0xFFBFBCCC),
                        )
                    }
                    innerTextField()
                }
            }
        )
    }
}

@Preview
@Composable
fun InviteDialogPreview() {
    InviteDialog()
}