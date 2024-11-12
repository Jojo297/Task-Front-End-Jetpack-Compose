package com.example.taskfront_end.pages.Home

import Model.Books
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter


@Composable
fun BookItemColumn(book: Books) {
    Box(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .width(338.dp)
            .height(143.dp)
            .shadow(
                elevation = 6.dp,
                spotColor = Color(0x0D000000),
                ambientColor = Color(0x0D000000)
            )
            .border(
                width = 1.dp,
                color = Color(0x1A000000),
                shape = RoundedCornerShape(size = 5.dp)
            )
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 5.dp))
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = rememberImagePainter(book.imageUrl),
                contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(120.dp)
                    .clip(RoundedCornerShape(5.dp))
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)

            ) {
//                Judul
                Text(
                    text = book.title,
                    maxLines = 2,
                    style = TextStyle(fontWeight = FontWeight.Bold)
                )

                Spacer(modifier = Modifier.height(16.dp))

//              Deskripsi
                Text(
                    text = book.description,
                    maxLines = 3,
                    style = TextStyle(fontWeight = FontWeight.Normal)
                )
            }
        }
    }
}