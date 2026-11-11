package com.example.scpidle.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scpidle.R
import com.example.scpidle.ui.theme.SCPIdleTheme

data class SeccionExpedienteData(
    @StringRes val titulo: Int,
    val texto: String
)

@Composable
fun SeccionExpediente(data: SeccionExpedienteData, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = stringResource(data.titulo), style = MaterialTheme.typography.titleMedium)
            Text(
                text = data.texto,
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SeccionExpedientePreview() {
    SCPIdleTheme {
        SeccionExpediente(
            data = SeccionExpedienteData(
                titulo = R.string.expediente_descripcion,
                texto = "Texto de ejemplo de una sección del expediente."
            ),
            modifier = Modifier.padding(16.dp)
        )
    }
}
