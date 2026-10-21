package com.example.scpidle.ui.pages

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scpidle.data.DatosEjemplo
import com.example.scpidle.ui.components.FilaSkill
import com.example.scpidle.ui.components.FilaVida

@Composable
fun InicioPage() {
    Scaffold { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .padding(horizontal = 16.dp)
        ) {
            item {
                Text("SCP Idle", style = MaterialTheme.typography.headlineMedium)
                Text("Habilidades", style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(top = 16.dp))
            }
            items(DatosEjemplo.skills) { skill -> FilaSkill(skill) }
            item {
                Text("Últimas vidas", style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(top = 16.dp))
            }
            items(DatosEjemplo.vidas) { vida -> FilaVida(vida) }
            item {
                Button(
                    onClick = { /* Navegará a Turno más adelante */ },
                    modifier = Modifier.fillMaxWidth().padding(vertical = 16.dp)
                ) {
                    Text("Nueva vida")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InicioPagePreview() {
    InicioPage()
}
