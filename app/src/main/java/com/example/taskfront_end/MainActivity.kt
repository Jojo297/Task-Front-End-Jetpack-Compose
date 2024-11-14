package com.example.taskfront_end

import Navigation.MainScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.taskfront_end.pages.About.AboutPage
import com.example.taskfront_end.ui.theme.TaskFrontEndTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskFrontEndTheme {
                // Buat NavHostController
                val navController = rememberNavController()
                // Panggil MainScreen dengan navController
                MainScreen(navController = navController)
            }
        }
    }
}

