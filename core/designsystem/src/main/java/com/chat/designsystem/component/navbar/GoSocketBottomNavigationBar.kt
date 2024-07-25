package com.chat.designsystem.component.navbar

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.chat.designsystem.R
import com.chat.designsystem.theme.IcDirectMessage
import com.chat.designsystem.theme.IcFriend
import com.chat.designsystem.theme.IcHome
import com.chat.designsystem.theme.IcSearch
import com.chat.designsystem.theme.IcSpace

// TODO: NavHostController로 제어하도록 수정
@Composable
fun GoSocketBottomNavigationBar() {
    var selectedIndex by remember { mutableIntStateOf(-1) }
    val items = listOf(
//        IcHome(),
//        IcDirectMessage(),
//        IcSpace(),
//        IcSearch(),
//        IcFriend(),
        R.drawable.icon_home,
        R.drawable.icon_direct_message,
        R.drawable.icon_space,
        R.drawable.icon_search,
        R.drawable.icon_friend
    )

    NavigationBar(containerColor = Color(0xFFF8F9FB)) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                selected = selectedIndex == index,
                onClick = { selectedIndex = index },
                icon = {
                    Icon(
                        modifier = Modifier.size(30.dp),
                        painter = painterResource(id = item),
                        contentDescription = "contentDescription",
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF6263FB),
                    unselectedIconColor = Color(0xFF848484),
                    indicatorColor = Color.Transparent
                )
            )
        }
    }
}

@Preview
@Composable
fun GoSocketBottomNavigationBarPreview() {
    GoSocketBottomNavigationBar()
}