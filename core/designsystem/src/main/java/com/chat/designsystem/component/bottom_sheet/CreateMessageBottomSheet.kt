package com.chat.designsystem.component.bottom_sheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcCreateDirectMessage
import com.chat.designsystem.theme.IcCreateSpace
import com.chat.designsystem.theme.Typography
import com.chat.designsystem.util.clickableNoRipple

@Composable
fun CreateMessageBottomSheet(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    onCreateDirectMessage: () -> Unit,
    onCreateSpace: () -> Unit,
) {
    GoSocketBottomSheet(
        modifier = modifier,
        onDismissRequest = onDismissRequest
    ) {
        repeat(2) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickableNoRipple { if (it == 0) onCreateDirectMessage() else onCreateSpace() },
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (it == 0) {
                    IcCreateDirectMessage(
                        modifier = Modifier.size(24.dp),
                        tint = Color.Black
                    )
                    Text(
                        text = "다이렉트 메시지 생성",
                        color = Color(0xFF111111),
                        style = Typography.m2,
                    )
                } else {
                    IcCreateSpace(
                        modifier = Modifier.size(24.dp),
                        tint = Color.Black
                    )
                    Text(
                        text = "스페이스 생성",
                        color = Color(0xFF111111),
                        style = Typography.m2,
                    )
                }
            }
            if (it == 0) Spacer(modifier = Modifier.height(12.dp))
        }
    }
}

@Preview
@Composable
fun CreateMessageBottomSheetPreview() {
    var isBottomSheetOpen by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        if (isBottomSheetOpen) {
            CreateMessageBottomSheet(
                onDismissRequest = { isBottomSheetOpen = false },
                onCreateDirectMessage = { isBottomSheetOpen = false },
                onCreateSpace = { isBottomSheetOpen = false }
            )
        }

        Button(onClick = { isBottomSheetOpen = true }) {
            Text(text = "Open")
        }
    }
}