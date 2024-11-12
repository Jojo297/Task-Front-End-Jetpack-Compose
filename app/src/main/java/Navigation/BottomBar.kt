package Navigation

import NavItem
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.taskfront_end.R
import androidx.navigation.compose.currentBackStackEntryAsState



@Composable
fun BottomBar(navController: NavHostController) {
    val navItemsList = listOf(
        NavItem("Home", painterResource(id = R.drawable.baseline_home_24), Screen.Home),
        NavItem("Artikel", painterResource(id = R.drawable.baseline_menu_book_24), Screen.Artikel),
        NavItem("About", painterResource(id = R.drawable.baseline_settings_24), Screen.About),
    )

    NavigationBar {
        val navBackStackEntry = navController.currentBackStackEntryAsState().value
        val currentRoute = navBackStackEntry?.destination?.route

        navItemsList.forEach { navItem ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = navItem.icon,
                        contentDescription = null
                    )
                },
                label = { Text(navItem.label) },
                selected = currentRoute == navItem.screen.route,
                onClick = {
                        navController.navigate(navItem.screen.route) {

                            popUpTo(navController.graph.startDestinationId) { saveState = true }
                            launchSingleTop = true
                            restoreState = true
                        }
                }
            )
        }
    }
}