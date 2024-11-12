import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem (
    val label : String,
    val icon : Painter,
    val screen : Screen,
)

//class NavItem (
//    val label : String,
//    val icon : Painter,
//)
