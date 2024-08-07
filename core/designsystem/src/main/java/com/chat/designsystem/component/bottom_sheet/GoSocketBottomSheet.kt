package com.chat.designsystem.component.bottom_sheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.chat.designsystem.util.toDp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoSocketBottomSheet(
    modifier: Modifier = Modifier,
    onDismissRequest: () -> Unit,
    content: @Composable () -> Unit,
) {
    val bottomSheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)
    val insets = ViewCompat.getRootWindowInsets(LocalView.current)
    val context = LocalView.current.context
    val navigationBarHeight = insets?.getInsets(WindowInsetsCompat.Type.navigationBars())?.bottom?.toDp(context)?.dp ?: 0.dp

    ModalBottomSheet(
        sheetState = bottomSheetState,
        shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
        containerColor = Color.White,
        dragHandle = {
            HorizontalDivider(
                modifier = Modifier
                    .width(32.dp)
                    .clip(CircleShape)
                    .padding(top = 6.dp, bottom = 8.dp),
                thickness = 4.dp,
                color = Color(0xFFC6C6C8)
            )
        },
        onDismissRequest = onDismissRequest,
    ) {
        Column(modifier = modifier.padding(start = 10.dp, top = 6.dp, end = 10.dp, bottom = 28.dp + navigationBarHeight)) {
            content()
        }
    }
}

@Preview
@Composable
fun GoSocketBottomSheetPreview() {
    var isBottomSheetOpen by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        if (isBottomSheetOpen) {
            GoSocketBottomSheet(onDismissRequest = { isBottomSheetOpen = false }) {
                Text(text = "GoSocketBottomSheetPreview")
            }
        }

        Button(onClick = { isBottomSheetOpen = true }) {
            Text(text = "Open")
        }
    }
}