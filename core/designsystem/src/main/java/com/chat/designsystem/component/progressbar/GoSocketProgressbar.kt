package com.chat.designsystem.component.progressbar

import androidx.compose.foundation.layout.height
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.N4
import com.chat.designsystem.theme.P1

@Composable
fun GoSocketProgressbar(
    progress: Float,
    modifier: Modifier = Modifier,
) {
    LinearProgressIndicator(
        progress = { progress },
        modifier = modifier.height(2.dp),
        color = P1,
        trackColor = N4
    )
}

@Preview
@Composable
fun GoSocketProgressbarPreview() {
    GoSocketProgressbar(progress = 0.33f)
}