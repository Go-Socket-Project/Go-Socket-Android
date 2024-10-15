package com.chat.designsystem.component.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.Typography

@Composable
fun GoSocketOutlinedButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    shape: Shape = RoundedCornerShape(4.dp),
    color: Color = Color(0xFF6263FB),
    colors: ButtonColors = ButtonDefaults.outlinedButtonColors(contentColor = color),
    textStyle: TextStyle = Typography.b5,
    elevation: ButtonElevation? = null,
    border: BorderStroke? = BorderStroke(1.dp, color),
    contentPadding: PaddingValues = PaddingValues(horizontal = 18.dp, vertical = 8.dp),
    onClick: () -> Unit,
) {
    OutlinedButton(
        modifier = modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        elevation = elevation,
        border = border,
        contentPadding = contentPadding,
        onClick = onClick
    ) {
        Text(
            text = text,
            style = textStyle,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GoSocketOutlinedButtonPreview() {
    Column {
        GoSocketOutlinedButton(text = "GoSocketOutlinedButton") {}

        GoSocketOutlinedButton(
            color = Color(0xFFFF7D7D),
            text = "GoSocketOutlinedButton"
        ) {}
    }
}
