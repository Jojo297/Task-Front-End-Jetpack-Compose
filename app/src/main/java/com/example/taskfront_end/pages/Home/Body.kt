package com.example.taskfront_end.pages.Home

import Model.Books
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter



@Composable
fun Body(
    modifier: Modifier = Modifier,
    books: List<Books> = DummyData.dummyBooks,
    ) {

    Column(
        modifier = modifier.padding(top = 10.dp),
    ) {
        Text(
            text = "Buku Populer",
            modifier = Modifier.padding(horizontal = 16.dp),
            // Sub-headline / Subdue
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF181D27),
            )
        )

        LazyRow(
            modifier = Modifier.padding(top = 16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(start = 16.dp, end = 16.dp)
        ) {
            items(books, key = { it.id }) { book ->
                BookItemRow(book)
            }
        }

        Text(
            text = "Buku Terbaru",
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 20.dp),
            // Sub-headline / Subdue
            style = TextStyle(
                fontSize = 14.sp,
                lineHeight = 19.sp,
                fontWeight = FontWeight(500),
                color = Color(0xFF181D27),
            )
        )
        LazyColumn(
            modifier = Modifier.padding(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            items(books, key = { it.id }) { book ->
                BookItemColumn(book)
            }
        }
    }



}
