package com.example.scpidle.ui.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.scpidle.ui.components.TarjetaSkill
import com.example.scpidle.ui.viewmodels.HabilidadesViewModel

@Composable
fun HabilidadesPage(viewModel: HabilidadesViewModel = viewModel()) {
    val estado by viewModel.estado.collectAsState()

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(estado.habilidades) { habilidad ->
            TarjetaSkill(data = habilidad)
        }
    }
}
