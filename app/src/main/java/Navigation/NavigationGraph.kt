package Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.taskfront_end.pages.About.AboutPage
import com.example.taskfront_end.pages.Buku.BukuPage
import com.example.taskfront_end.pages.Home.HomePage

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = Screen.Home.route, modifier = modifier) {
        composable(Screen.Home.route) { HomePage() }
        composable(Screen.Buku.route) { BukuPage(navController = navController) }
        composable(Screen.About.route) { AboutPage() }
    }
}