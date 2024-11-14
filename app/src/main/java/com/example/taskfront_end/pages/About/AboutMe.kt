package com.example.taskfront_end.pages.About

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AbotMe(modifier: Modifier = Modifier){

    Column(
        modifier = Modifier
            .padding(top = 8.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp, Alignment.Top),
        horizontalAlignment = Alignment.Start,
    ) {
        // name
        OutlinedTextField(
            label = { Text("Name") },
            value = "Muhammad Afiffudin Al Mahdi",
            onValueChange = {},
            enabled = false,
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledTextColor = Color.Black,
                containerColor = Color(0xFFF3F8FF)
            )
        )

        // Email
        OutlinedTextField(
            label = { Text("Email") },
            value = "mafiffudin28@gmail.com",
            onValueChange = {},
            enabled = false,
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledTextColor = Color.Black,
                containerColor = Color(0xFFF3F8FF)
            )
        )

        // Kampus
        OutlinedTextField(
            label = { Text("Perguruan Tinggi") },
            value = "Politeknik Negeri Batam",
            onValueChange = {},
            enabled = false,
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledTextColor = Color.Black,
                containerColor = Color(0xFFF3F8FF)
            )
        )

        // Jurusan
        OutlinedTextField(
            label = { Text("Jurusan") },
            value = "Teknik Informatika",
            onValueChange = {},
            enabled = false,
            readOnly = true,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                disabledTextColor = Color.Black,
                containerColor = Color(0xFFF3F8FF)
            )
        )
    }
}