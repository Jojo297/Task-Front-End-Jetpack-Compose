
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.taskfront_end.R
import com.example.taskfront_end.pages.AboutPage
import com.example.taskfront_end.pages.ArtikelPage
import com.example.taskfront_end.pages.HomePage

@Composable
fun MainSCreen(modifier: Modifier = Modifier){

    val navItemsList = listOf(
        NavItem("Home", painterResource(id = R.drawable.baseline_home_24)),
        NavItem("Artikel", painterResource(id = R.drawable.baseline_menu_book_24)),
        NavItem("About", painterResource(id = R.drawable.baseline_settings_24)),
    )

    var selectedIndex = remember {
        mutableIntStateOf(0)
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemsList.forEachIndexed { index, navItem ->
                    NavigationBarItem(
                        selected = selectedIndex.intValue == index,
                        onClick = {
                            selectedIndex.intValue = index
                        },
                        icon = {
                            Icon(painter = navItem.icon, contentDescription = "Icon")
                        },
                        label = {
                            Text(text = navItem.label)
                        }
                    )
                }
            }
        }
        ) { innerPadding ->
        ContentScreen(modifier = Modifier.padding(innerPadding),selectedIndex)
    }
}

@Composable
fun ContentScreen(modifier: Modifier = Modifier, selectedIndex: MutableIntState){
    when(selectedIndex.intValue){
        0 -> HomePage()
        1 -> ArtikelPage()
        2 -> AboutPage()
    }
}
