package com.example.scpidle.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.scpidle.data.DatosEjemplo
import com.example.scpidle.ui.components.FilaVidaData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class VidasUiState(
    val vidas: List<FilaVidaData> = emptyList()
)

class VidasViewModel : ViewModel() {
    private val _estado = MutableStateFlow(
        VidasUiState(
            vidas = DatosEjemplo.vidas.map { vida ->
                FilaVidaData(
                    numero = vida.numero,
                    entidad = vida.entidad,
                    turnos = vida.turnos
                )
            }
        )
    )
    val estado: StateFlow<VidasUiState> = _estado.asStateFlow()
}
