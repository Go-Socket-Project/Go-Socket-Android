package com.chat.designsystem.component.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.chat.designsystem.theme.IcSmallX
import com.chat.designsystem.theme.Typography

@Composable
fun GoSocketDialog(
    modifier: Modifier = Modifier,
    background: Color = Color.White,
    backgroundShape: Shape = RoundedCornerShape(8.dp),
    padding: PaddingValues = PaddingValues(0.dp),
    properties: DialogProperties = DialogProperties(),
    onDismissRequest: () -> Unit = {},
    onButtonClicked: () -> Unit = {},
    content: @Composable ColumnScope.() -> Unit = {},
) {
    Dialog(
        onDismissRequest = onDismissRequest,
        properties = properties
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .background(
                    color = background,
                    shape = backgroundShape
                )
                .padding(padding)
        ) {
            content()

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
                        contentColor = Color.White
                    ),
                    shape = RoundedCornerShape(4.dp),
                    contentPadding = PaddingValues(
                        horizontal = 22.dp,
                        vertical = 6.dp
                    ),
                    onClick = { onButtonClicked() }
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
fun GoSocketDialogPreview() {
    GoSocketDialog {
        IcSmallX(
            modifier = Modifier
                .size(22.dp)
                .align(Alignment.End)
        )
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            text = "GoSocketDialog"
        )
        Spacer(modifier = Modifier.height(30.dp))
    }
}