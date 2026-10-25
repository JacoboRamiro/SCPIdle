package com.example.scpidle.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scpidle.data.DatosEjemplo
import com.example.scpidle.data.model.Entidad
import com.example.scpidle.ui.components.SeccionExpediente
import com.example.scpidle.ui.theme.SCPIdleTheme

// Página de detalle: sin Scaffold, sin menú lateral y sin navegación
@Composable
fun ExpedientePage(entidad: Entidad, modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Text(text = entidad.codigo, style = MaterialTheme.typography.headlineMedium)
            Text(
                text = "${entidad.nombre} · Clase ${entidad.clase}",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.primary
            )
            SeccionExpediente(titulo = "Procedimientos de contención", texto = entidad.contencion)
            SeccionExpediente(titulo = "Descripción", texto = entidad.descripcion)
            Text(
                text = "Autor original: ${entidad.autor}",
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = entidad.enlace,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ExpedientePagePreview() {
    SCPIdleTheme {
        ExpedientePage(DatosEjemplo.entidad)
    }
}