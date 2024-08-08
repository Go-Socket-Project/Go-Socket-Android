package com.chat.designsystem.component.checkbox

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.N3
import com.chat.designsystem.theme.P1
import com.chat.designsystem.util.clickableNoRipple

@Composable
fun GoSocketCheckbox(
    modifier: Modifier = Modifier,
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
) {
    var isChecked by remember { mutableStateOf(checked) }

    Checkbox(
        modifier = modifier
            .size(20.dp)
            .clip(RoundedCornerShape(8.dp))
            .border(
                width = 2.dp,
                color =  if (isChecked) P1 else N3,
                shape = RoundedCornerShape(8.dp)
            )
            .clickableNoRipple {
                isChecked = !isChecked
                onCheckedChange(isChecked)
            },
        checked = isChecked,
        onCheckedChange = null,
        colors = CheckboxDefaults.colors(checkedColor = P1)
    )
}

@Preview
@Composable
fun GoSocketCheckboxPreview() {
    Column {
        GoSocketCheckbox(checked = true) {}
        Spacer(modifier = Modifier.height(10.dp))
        GoSocketCheckbox(checked = false) {}
    }
}