package com.example.taskfront_end.pages.About

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskfront_end.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutPage(modifier: Modifier = Modifier) {

        Column(
            modifier = Modifier
                .padding(top = 26.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally, // Mengatur elemen di dalam Column agar berada di tengah
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                modifier = Modifier
                    .width(53.dp)
                    .height(53.dp),
                painter = painterResource(id = R.drawable.user_image),
                contentDescription = "Photo Profile",
                contentScale = ContentScale.FillBounds
            )

            Text(
                text = "Itunuoluwa Abidoye",
                style = TextStyle(
                    fontSize = 16.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight(700),
                    color = Color(0xFF181D27),
                    textAlign = TextAlign.Center,
                )
            )

            Text(
                text = "Itunuoluwa@petra.africa",
                style = TextStyle(
                    fontSize = 13.sp,
                    lineHeight = 19.5.sp,
                    fontWeight = FontWeight(400),
                    color = Color(0xFFABABAB),
                    textAlign = TextAlign.Center,
                )
            )

            Spacer(modifier = Modifier.height(16.dp))

            Column {
                Text(
                    text = "Name"
                )
                Text(
                    text = "Email"
                )
                Text(
                    text = "Asal Perguruan Tinggi"
                )
                Text(
                    text = "Jurusan"
                )
            }
        }

    }