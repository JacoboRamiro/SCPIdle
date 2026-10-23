package com.example.scpidle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.scpidle.ui.pages.PantallaPrincipal
import com.example.scpidle.ui.theme.SCPIdleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SCPIdleTheme {
                PantallaPrincipal()
            }
        }
    }
}
