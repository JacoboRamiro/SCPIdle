package com.example.scpidle.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.scpidle.R
import com.example.scpidle.ui.navigation.Rutas
import com.example.scpidle.ui.navigation.ScpIdleNavGraph
import kotlinx.coroutines.launch

// Raíz de la app: el único Scaffold, con el NavGraph como contenido.
// Las páginas no saben nada del Scaffold ni de la navegación.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScpIdleApp() {
    val navController = rememberNavController()
    val entrada by navController.currentBackStackEntryAsState()
    val rutaActual = entrada?.destination?.route
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val avisoNuevaVida = stringResource(R.string.aviso_nueva_vida)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.app_name)) },
                navigationIcon = {
                    if (rutaActual == Rutas.EXPEDIENTE) {
                        IconButton(onClick = { navController.popBackStack() }) {
                            Icon(
                                Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = stringResource(R.string.accion_volver)
                            )
                        }
                    }
                },
                actions = {
                    IconButton(onClick = { /* Ajustes, más adelante */ }) {
                        Icon(
                            Icons.Default.Settings,
                            contentDescription = stringResource(R.string.accion_ajustes)
                        )
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = rutaActual == Rutas.HABILIDADES,
                    onClick = { navController.irASeccion(Rutas.HABILIDADES) },
                    icon = { Icon(Icons.Default.Star, contentDescription = null) },
                    label = { Text(stringResource(R.string.seccion_habilidades)) }
                )
                NavigationBarItem(
                    selected = rutaActual == Rutas.VIDAS,
                    onClick = { navController.irASeccion(Rutas.VIDAS) },
                    icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
                    label = { Text(stringResource(R.string.seccion_vidas)) }
                )
            }
        },
        floatingActionButton = {
            if (rutaActual == Rutas.HABILIDADES) {
                FloatingActionButton(
                    onClick = { scope.launch { snackbarHostState.showSnackbar(avisoNuevaVida) } }
                ) {
                    Icon(
                        Icons.Default.Add,
                        contentDescription = stringResource(R.string.accion_nueva_vida)
                    )
                }
            }
        },
        snackbarHost = { SnackbarHost(snackbarHostState) }
    ) { paddingValues ->
        ScpIdleNavGraph(
            navController = navController,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

// Cambia de sección de la barra inferior sin apilar pantallas repetidas
private fun NavHostController.irASeccion(ruta: String) {
    navigate(ruta) {
        popUpTo(graph.findStartDestination().id) { saveState = true }
        launchSingleTop = true
        restoreState = true
    }
}
