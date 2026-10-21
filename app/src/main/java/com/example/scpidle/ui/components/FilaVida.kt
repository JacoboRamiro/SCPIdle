package com.example.scpidle.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Arrangement
import com.example.scpidle.data.model.Vida

@Composable
fun FilaVida(vida: Vida, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth().padding(vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Vida ${vida.numero} · ${vida.entidad}")
        Text(text = "${vida.turnos} turnos")
    }
}

@Preview(showBackground = true)
@Composable
fun FilaVidaPreview() {
    FilaVida(Vida(12, "30/09/2026", 9, "SCP-173", "Correr"))
}
