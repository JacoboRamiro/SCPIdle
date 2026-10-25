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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scpidle.data.model.Skill
import com.example.scpidle.ui.theme.SCPIdleTheme

@Composable
fun TarjetaSkill(skill: Skill, modifier: Modifier = Modifier) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = skill.nombre, style = MaterialTheme.typography.titleMedium)
                Text(
                    text = "Nivel ${skill.nivel}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
            }
            LinearProgressIndicator(
                progress = { skill.experiencia.toFloat() / skill.experienciaSiguienteNivel },
                modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
            )
            Text(
                text = "${skill.experiencia} / ${skill.experienciaSiguienteNivel} xp",
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
        TarjetaSkill(Skill("Hacking", 3, 180, 250), modifier = Modifier.padding(16.dp))
    }
}