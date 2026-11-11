package com.example.scpidle.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.scpidle.ui.pages.ExpedientePage
import com.example.scpidle.ui.pages.HabilidadesPage
import com.example.scpidle.ui.pages.VidasPage

object Rutas {
    const val HABILIDADES = "habilidades"
    const val VIDAS = "vidas"
    const val EXPEDIENTE = "expediente"
}

@Composable
fun ScpIdleNavGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = Rutas.HABILIDADES,
        modifier = modifier
    ) {
        composable(Rutas.HABILIDADES) { HabilidadesPage() }
        composable(Rutas.VIDAS) {
            VidasPage(onAbrirExpediente = { navController.navigate(Rutas.EXPEDIENTE) })
        }
        composable(Rutas.EXPEDIENTE) { ExpedientePage() }
    }
}
