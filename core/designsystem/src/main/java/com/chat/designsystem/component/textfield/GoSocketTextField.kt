package com.chat.designsystem.component.textfield

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcSearch
import com.chat.designsystem.theme.IcSend
import com.chat.designsystem.theme.Typography

@Composable
fun GoSocketTextField(
    modifier: Modifier = Modifier,
    value: String,
    placeholder: String,
    singleLine: Boolean = true,
    maxLine: Int = 1,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    backgroundColor: Color = Color.White,
    textColor: Color = Color.Black,
    placeholderColor: Color = Color(0xFFBFBCCC),
    leadingIconColor: Color = placeholderColor,
    trailingIconColor: Color = placeholderColor,
    backgroundShape: Shape = RoundedCornerShape(8.dp),
    textStyle: TextStyle = Typography.m3,
    onValueChange: (String) -> Unit,
    leadingIcon: @Composable ((Color) -> Unit)? = null,
    trailingIcon: @Composable ((Color) -> Unit)? = null,
) {
    BasicTextField(
        modifier = modifier.background(
            color = backgroundColor,
            shape = backgroundShape
        ),
        value = value,
        onValueChange = onValueChange,
        textStyle = textStyle.copy(color = textColor),
        singleLine = singleLine,
        maxLines = maxLine,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        decorationBox = { innerTextField ->
            Box(
                modifier = modifier.padding(contentPadding)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    leadingIcon?.let { it(leadingIconColor) }
                    Box(modifier = Modifier.weight(1f)) {
                        if (value.isEmpty()) {
                            Text(
                                text = placeholder,
                                style = textStyle,
                                color = placeholderColor,
                            )
                        }
                        innerTextField()
                    }
                    trailingIcon?.let { it(trailingIconColor) }
                }
            }
        }
    )
}

@Composable
@Preview
fun GoSocketTextFieldPreview() {
    var value by remember { mutableStateOf("") }

    GoSocketTextField(
        value = value,
        placeholder = "제목 또는 작가명, 카테고리 검색",
        onValueChange = { value = it },
        leadingIcon = { IcSearch(modifier = Modifier.padding(end = 8.dp), tint = it) },
        trailingIcon = { IcSend(tint = it) },
    )
}
