package com.example.scpidle.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scpidle.R
import com.example.scpidle.ui.theme.SCPIdleTheme

data class FilaVidaData(
    val numero: Int,
    val entidad: String,
    val turnos: Int,
    val onClick: () -> Unit = {}
)

@Composable
fun FilaVida(data: FilaVidaData, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = data.onClick)
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(R.string.vida_titulo, data.numero, data.entidad),
            style = MaterialTheme.typography.bodyLarge
        )
        Text(
            text = stringResource(R.string.vida_turnos, data.turnos),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FilaVidaPreview() {
    SCPIdleTheme {
        Surface {
            FilaVida(data = FilaVidaData(12, "SCP-173", 9))
        }
    }
}
