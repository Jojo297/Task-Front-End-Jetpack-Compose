package com.example.taskfront_end.pages.About

import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskfront_end.R
import android.net.Uri

@Composable
fun Contact(modifier: Modifier = Modifier){

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 6.dp)
    ) {

        // instagram
        Button(
                modifier = Modifier
                    .width(330.dp)
                    .height(78.dp)
                    .fillMaxSize(), // Mengisi ukuran Box
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Transparent,
                    contentColor = Color.Black
                ),
                border = BorderStroke(
                    width = 2.dp,
                    color = Color(0xFF0601B4)
                ),
                onClick = {
                    val instagramUrl = "https://www.instagram.com/mastahh__/"
                    val intent = Intent(Intent.ACTION_VIEW).apply {
                        data = Uri.parse(instagramUrl)
                    }
                    context.startActivity(intent)
                }
            ) {

                Image(
                    modifier = Modifier
                        .size(45.dp),
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "Instagram",
                )

                Spacer(modifier = Modifier.width(20.dp))
                
                Text(
                    text = "Instagram",
                    fontSize = 16.sp,
                    )
            }

        Spacer(modifier = Modifier.height(8.dp))
        
        // linkedin
        Button(
            modifier = Modifier
                .width(330.dp)
                .height(78.dp)
                .fillMaxSize(), // Mengisi ukuran Box
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            ),
            border = BorderStroke(
                width = 2.dp,
                color = Color(0xFF0601B4)
            ),
            onClick = {
                val linkedinUrl = "https://www.linkedin.com/in/muhammad-afiffudin-al-mahdi-359023213"
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse(linkedinUrl)
                }
                context.startActivity(intent)
            }
        ) {

            Image(
                modifier = Modifier
                    .size(45.dp),
                painter = painterResource(id = R.drawable.linkedin),
                contentDescription = "Linkedin",
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Linkedin",
                fontSize = 16.sp,
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        // whatsapp
        Button(
            modifier = Modifier
                .width(330.dp)
                .height(78.dp)
                .fillMaxSize(), // Mengisi ukuran Box
            shape = RoundedCornerShape(15.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            ),
            border = BorderStroke(
                width = 2.dp,
                color = Color(0xFF0601B4)
            ),
            onClick = {
                val whatsappUrl = "https://wa.me/6285765351290"
                val intent = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse(whatsappUrl)
                }
                context.startActivity(intent)
            }
        ) {

            Image(
                modifier = Modifier
                    .size(45.dp),
                painter = painterResource(id = R.drawable.whatsapp),
                contentDescription = "Whatsapp",
            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(
                text = "Whatsapp",
                fontSize = 16.sp,
            )
        }

        }
    }

