package com.example.scpidle.ui.pages

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.scpidle.ui.components.FilaVida
import com.example.scpidle.ui.viewmodels.VidasViewModel

@Composable
fun VidasPage(
    onAbrirExpediente: () -> Unit,
    viewModel: VidasViewModel = viewModel()
) {
    val estado by viewModel.estado.collectAsState()

    LazyColumn(contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)) {
        items(estado.vidas) { vida ->
            FilaVida(data = vida.copy(onClick = onAbrirExpediente))
        }
    }
}
