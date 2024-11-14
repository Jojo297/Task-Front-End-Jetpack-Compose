package com.example.taskfront_end.pages.About

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.taskfront_end.R
import com.example.taskfront_end.ui.theme.TaskFrontEndTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutPage(
    modifier: Modifier = Modifier,
    navController: NavController
)
{

    // Variabel untuk melacak pilihan yang dipilih
    var aboutIsClicked by remember {
        mutableStateOf(true)
    }
    var contactIsClicked by remember {
        mutableStateOf(false)
    }

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
                    Text("About")
                }
            )
        }
    ) { innerPadding ->
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
            .padding(innerPadding)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Gambar Profil
        Image(
            painter = painterResource(id = R.drawable.user_image),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
                .border(2.dp, Color(0xFF7650FF), CircleShape)
                .background(Color.White),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Nama Pengguna
        Text(
            text = "M Afiffudin Al Mahdi",
            style = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF000000)
            )
        )

        // Informasi Kontak
        Text(
            modifier = Modifier.padding(top = 8.dp),
            text = "\"Menyerahlah dan jangan semangat\"",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color(0xFF666666)
            )
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Pilihan About Me dan Contact
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .clickable {
                        aboutIsClicked = true
                        contactIsClicked = false
                    },
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "About Me",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                AnimatedVisibility(visible = true) {
                    val underlineWidth by animateDpAsState(
                        targetValue = if (aboutIsClicked) 180.dp else 0.dp, label = ""
                    )
                    Box(
                        modifier = Modifier
                            .width(underlineWidth)
                            .height(3.dp)
                            .background(color = Color(0xFF0601B4))
                    )
                }
            }
            Column(
                modifier = Modifier
                    .width(180.dp)
                    .clickable {
                        contactIsClicked = true
                        aboutIsClicked = false
                    },
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Contact",
                    style = MaterialTheme.typography.titleSmall,
                    modifier = Modifier.padding(bottom = 4.dp)
                )

                AnimatedVisibility(visible = true) {
                    val underlineWidth by animateDpAsState(
                        targetValue = if (contactIsClicked) 180.dp else 0.dp,
                        label = ""
                    )
                    Box(
                        modifier = Modifier
                            .width(underlineWidth)
                            .height(3.dp)
                            .background(color = Color(0xFF0601B4))
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        // menampilkan pilihan yang dipilih
        if (aboutIsClicked) {
            AbotMe()
        } else if (contactIsClicked) {
            Contact()
        }

    }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TaskFrontEndTheme {
//        AboutPage(modifier = Modifier)
    }
}