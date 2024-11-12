package Navigation
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun MainScreen(modifier: Modifier = Modifier, navController: NavHostController) {
    Scaffold(
        bottomBar = { BottomBar(navController) },
        modifier = modifier // Gunakan modifier jika diperlukan
    ) { innerPadding ->
        NavigationGraph(navController = navController, modifier = Modifier.padding(innerPadding))
    }
}

