package com.example.scpidle.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scpidle.data.model.Skill

@Composable
fun FilaSkill(skill: Skill, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(vertical = 8.dp)) {
        Text(text = "${skill.nombre} · nivel ${skill.nivel}")
        LinearProgressIndicator(
            progress = { skill.experiencia.toFloat() / skill.experienciaSiguienteNivel },
            modifier = Modifier.fillMaxWidth().padding(top = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun FilaSkillPreview() {
    FilaSkill(Skill("Hacking", 3, 180, 250))
}
