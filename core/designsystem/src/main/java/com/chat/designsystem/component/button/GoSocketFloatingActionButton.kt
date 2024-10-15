package com.chat.designsystem.component.button

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcGrayRocket
import com.chat.designsystem.theme.IcHeavyPlus

@Composable
fun GoSocketFloatingActionButton(
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    containerColor: Color = Color(0xFF6263FB),
    contentColor: Color = Color.White,
    onClick: () -> Unit,
) {
    FloatingActionButton(
        modifier = modifier.size(50.dp),
        shape = shape,
        containerColor = containerColor,
        contentColor = contentColor,
        onClick = onClick,
    ) {
        Box(contentAlignment = Alignment.Center) {
            IcGrayRocket(
                modifier = Modifier
                    .size(27.dp)
                    .offset(x = (-1).dp, y = 1.dp)
            )
            IcHeavyPlus(
                modifier = Modifier
                    .size(10.dp)
                    .align(Alignment.TopEnd)
                    .offset(x = 2.dp, y = (-2).dp),
                tint = Color.White
            )
        }
    }
}

@Preview
@Composable
fun GoSocketFloatingActionButtonPreview() {
    GoSocketFloatingActionButton {}
}
