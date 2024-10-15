package com.chat.designsystem.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcCreateDirectMessage
import com.chat.designsystem.theme.Typography

@Composable
fun GoSocketButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(8.dp),
    colors: ButtonColors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6263FB)),
    textColor: Color = Color.White,
    textStyle: TextStyle = Typography.b5,
    elevation: ButtonElevation? = null,
    border: BorderStroke? = null,
    contentPadding: PaddingValues = PaddingValues(horizontal = 18.dp, vertical = 9.dp),
    onClick: () -> Unit,
    leadingIcon: @Composable (() -> Unit)? = null,
) {
    Button(
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        onClick = onClick,
    ) {
        if (leadingIcon != null) {
            leadingIcon()
            Spacer(modifier = Modifier.width(7.dp))
        }
        Text(
            text = text,
            color = textColor,
            style = textStyle,
        )
    }
}

@Preview
@Composable
fun GoSocketButtonPreview() {
    Column {
        GoSocketButton(
            text = "GoSocketButton",
            onClick = {}
        ) {}

        GoSocketButton(
            text = "GoSocketButton",
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF7D7D)),
            onClick = {}
        ) {}

        GoSocketButton(
            text = "GoSocketButton",
            onClick = {}
        ) { IcCreateDirectMessage(modifier = Modifier.size(22.dp, 18.dp), tint = Color.White) }
    }
}
