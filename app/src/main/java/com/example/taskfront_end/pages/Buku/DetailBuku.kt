package com.example.taskfront_end.pages.Buku

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberImagePainter

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailBuku(
    modifier: Modifier = Modifier,
    navController: NavController,
    idBuku: Int?
) {
    val book = DummyData.dummyBooks.find { it.id == idBuku }


    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color(0xFF0601B4),
                    titleContentColor = Color(0xFFFFFFFF),
                ),
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Localized description",
                            tint = Color(0xFFFFFFFF)
                        )
                    }
                },
                title = {
                    Text("Detail Buku")
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = modifier
                .padding(innerPadding)
                .padding(16.dp),
        ) {
            // Menggunakan operator aman untuk mengakses properti
            Image(
                painter = rememberImagePainter(book?.imageUrl),
                contentDescription = book?.title,
                modifier = Modifier
                    .padding(bottom = 8.dp)
                    .fillMaxWidth()
                    .height(200.dp)
            )

            Row(
                modifier = Modifier.padding(top = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                
                Column(
                    modifier = Modifier.padding(bottom = 6.dp)
                ) {

                    Text(

                        text = "Judul: "
                    )
                    Text(

                        text = "Deskripsi: "
                    )

                }
                Spacer(modifier = Modifier.height(8.dp))
                Column() {

                    Text(
                        text = book?.title ?: " Buku tidak ditemukan"
                    )
                    Text(
                        text = book?.description ?: " Buku tidak ditemukan"
                    )
                }
                
            }

        }
    }
}