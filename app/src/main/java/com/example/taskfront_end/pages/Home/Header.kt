package com.example.taskfront_end.pages.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskfront_end.R

@Composable
fun Header(modifier: Modifier = Modifier){
    Column(
        modifier = modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "Welcome",
            modifier = Modifier
//                .padding(top = 10.dp)
                .width(92.dp)
                .height(21.dp),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF181D27),
            )
        )

        Box(
            modifier = Modifier
                .shadow(
                    elevation = 44.dp,
                    spotColor = Color(0x0F000000),
                    ambientColor = Color(0x0F000000)
                )
                .width(343.dp)
                .height(89.dp)
                .background(color = Color(0xFF0601B4), shape = RoundedCornerShape(size = 5.dp))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Row{
                    Image(
                        modifier = Modifier
                            .width(53.dp)
                            .height(53.dp),
                        painter = painterResource(id = R.drawable.user_image),
                        contentDescription = "Photo Profile",
                        contentScale = ContentScale.FillBounds
                    )

                    Column(
                        modifier = Modifier
                            .padding(horizontal = 13.dp, vertical = 10.dp)
                            .width(134.dp)
                            .height(35.dp)
                    ) {
                        Text(
                            text = "M Afiffudin Al Mahdi",
                            style = TextStyle(
                                fontSize = 14.sp,
                                lineHeight = 19.sp,
                                fontWeight = FontWeight(700),
                                color = Color(0xFFFFFFFF),
                            )
                        )
                        Text(
                            text = "@Mastahh__",
                            style = TextStyle(
                                fontSize = 11.sp,
                                lineHeight = 12.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFFD7D7D7),
                            )
                        )
                    }
                }


                // Pindahkan gambar panah ke dalam Row yang sama
                Image(
                    modifier = Modifier
                        .padding(start = 16.dp) // Menambahkan padding jika diperlukan
                        .width(24.dp) // Sesuaikan ukuran gambar panah
                        .height(24.dp),
                    painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                    contentDescription = "image description",
                    contentScale = ContentScale.None
                )
            }
        }
    }
}