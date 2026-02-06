package com.anibalofice.simpletask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.anibalofice.simpletask.ui.theme.TaskSimpleTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TaskSimpleTheme {
                val navController = rememberNavController()
                MyAppRouter(navController)

            }
        }
    }
}