package com.example.scpidle.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.scpidle.R
import com.example.scpidle.ui.components.SeccionExpediente
import com.example.scpidle.ui.viewmodels.ExpedienteViewModel

// Página de detalle: sin Scaffold propio, sin menú lateral y sin navegación.
// Los datos vienen del estado de su ViewModel.
@Composable
fun ExpedientePage(viewModel: ExpedienteViewModel = viewModel()) {
    val estado by viewModel.estado.collectAsState()

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {
            Text(text = estado.codigo, style = MaterialTheme.typography.headlineMedium)
        }
        item {
            Text(
                text = stringResource(R.string.expediente_subtitulo, estado.nombre, estado.clase),
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )
        }
        items(estado.secciones) { seccion ->
            SeccionExpediente(data = seccion)
        }
        item {
            Text(
                text = stringResource(R.string.expediente_autor, estado.autor),
                style = MaterialTheme.typography.bodySmall
            )
        }
        item {
            Text(
                text = estado.enlace,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}
