package com.example.scpidle.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scpidle.R
import com.example.scpidle.ui.theme.SCPIdleTheme

data class TarjetaSkillData(
    val nombre: String,
    val nivel: Int,
    val experiencia: Int,
    val experienciaSiguienteNivel: Int
) {
    // Evita dividir entre 0 y que la barra se salga de 0..1
    val progreso: Float
        get() = if (experienciaSiguienteNivel > 0) {
            (experiencia.toFloat() / experienciaSiguienteNivel).coerceIn(0f, 1f)
        } else {
            0f
        }
}

@Composable
fun TarjetaSkill(data: TarjetaSkillData, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = data.nombre, style = MaterialTheme.typography.titleMedium)
                Text(
                    text = stringResource(R.string.skill_nivel, data.nivel),
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            LinearProgressIndicator(
                progress = { data.progreso },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
            )
            Text(
                text = stringResource(
                    R.string.skill_experiencia,
                    data.experiencia,
                    data.experienciaSiguienteNivel
                ),
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TarjetaSkillPreview() {
    SCPIdleTheme {
        TarjetaSkill(
            data = TarjetaSkillData("Hacking", 3, 180, 250),
            modifier = Modifier.padding(16.dp)
        )
    }
}
