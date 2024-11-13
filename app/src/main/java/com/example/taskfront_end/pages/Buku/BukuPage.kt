package com.example.taskfront_end.pages.Buku
import Model.Books
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.taskfront_end.pages.Home.BookItemRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BukuPage(
    modifier: Modifier = Modifier,
    books: List<Books> = DummyData.dummyBooks,
    navController: NavController
) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF0601B4),
                    titleContentColor = Color(0xFFFFFFFF),
                ),
                navigationIcon = {
                    IconButton(onClick = { navController.navigate(Screen.Home.route) }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Localized description",
                            tint = Color(0xFFFFFFFF)
                        )
                    }
                },
                title = {
                    Text("Daftar Buku")
                }
            )
        }
    ) {
        innerPadding ->

        LazyVerticalGrid(
            contentPadding = PaddingValues(16.dp), // Menggunakan operator penjumlahan
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            columns = GridCells.Adaptive(140.dp),
            modifier = modifier.fillMaxSize()
                .padding(innerPadding)
        ) {
            items(books, key = { it.id }) { book ->
                BookItemRow(book){ idBuku ->
                    navController.navigate("detail/$idBuku")
                }
            }
        }
    }
}

