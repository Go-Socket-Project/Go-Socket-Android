package com.chat.designsystem.component.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.chat.designsystem.icon.IcSmallX
import com.chat.designsystem.theme.Typography
import com.chat.designsystem.util.clickableNoRipple

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InviteDialog(
    modifier: Modifier = Modifier,
    properties: DialogProperties = DialogProperties(),
    onDismissRequest: () -> Unit = {},
) {
    var text by remember { mutableStateOf("") }
    val focusRequester by remember { mutableStateOf(FocusRequester()) }
    var isFocus by remember { mutableStateOf(false) }

    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    color = White,
                    shape = RoundedCornerShape(8.dp)
                )
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
                        color = Color(0xFFBFBCCC),
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
//                    TextFieldDefaults.DecorationBox(
//                        value = text,
//                        placeholder = {
//                            Text(
//                                text = "Email", // 원래 placeholder를 받아서 처리
//                                style = Typography.m4,
//                                color = Color(0xFFBFBCCC),
//                            )
//                        },
//                        innerTextField = innerTextField,
//                        enabled = true, // 받아서 처리
//                        singleLine = true, // 받아서 처리
//                        visualTransformation = VisualTransformation.None, // 받아서 처리
//                        interactionSource = remember { MutableInteractionSource() }, // 받아서 처리
//                        contentPadding = TextFieldDefaults.contentPaddingWithoutLabel(
//                            start = 14.dp,
//                            top = 9.dp,
//                            bottom = 9.dp,
//                        ),
//                    )
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

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFFF2F2F4),
                        shape = RoundedCornerShape(
                            bottomStart = 8.dp,
                            bottomEnd = 8.dp
                        )
                    )
                    .padding(vertical = 11.dp),
                horizontalArrangement = Arrangement.End
            ) {
                Button(
                    modifier = Modifier
                        .height(28.dp)
                        .padding(end = 17.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6263FB),
                        contentColor = White
                    ),
                    shape = RoundedCornerShape(4.dp),
                    contentPadding = PaddingValues(
                        horizontal = 22.dp,
                        vertical = 6.dp
                    ),
                    onClick = { /*TODO*/ }
                ) {
                    Text(
                        modifier = Modifier,
                        text = "만들기",
                        style = Typography.m5,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun InviteDialogPreview() {
    InviteDialog()
}