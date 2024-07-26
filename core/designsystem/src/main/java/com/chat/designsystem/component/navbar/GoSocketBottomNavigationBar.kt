package com.chat.designsystem.component.navbar

import androidx.compose.foundation.layout.size
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.theme.IcDirectMessage
import com.chat.designsystem.theme.IcFriend
import com.chat.designsystem.theme.IcHome
import com.chat.designsystem.theme.IcSearch
import com.chat.designsystem.theme.IcSpace

// TODO: NavHostController로 제어하도록 수정
@Composable
fun GoSocketBottomNavigationBar() {
    var selectedIndex by remember { mutableIntStateOf(-1) }

    NavigationBar(containerColor = Color(0xFFF8F9FB)) {
        repeat(5) {
            NavigationBarItem(
                selected = selectedIndex == it,
                onClick = { selectedIndex = it },
                icon = {
                    when(it) {
                        0 -> IcHome(modifier = Modifier.size(30.dp), tint = if (selectedIndex == it) Color(0xFF6263FB) else Color(0xFF848484))
                        1 -> IcDirectMessage(modifier = Modifier.size(30.dp), tint = if (selectedIndex == it) Color(0xFF6263FB) else Color(0xFF848484))
                        2 -> IcSpace(modifier = Modifier.size(30.dp), tint = if (selectedIndex == it) Color(0xFF6263FB) else Color(0xFF848484))
                        3 -> IcSearch(modifier = Modifier.size(30.dp), tint = if (selectedIndex == it) Color(0xFF6263FB) else Color(0xFF848484))
                        4 -> IcFriend(modifier = Modifier.size(30.dp), tint = if (selectedIndex == it) Color(0xFF6263FB) else Color(0xFF848484))
                    }
                },
                colors = NavigationBarItemDefaults.colors(indicatorColor = Color.Transparent)
            )
        }
    }
}

@Preview
@Composable
fun GoSocketBottomNavigationBarPreview() {
    GoSocketBottomNavigationBar()
}