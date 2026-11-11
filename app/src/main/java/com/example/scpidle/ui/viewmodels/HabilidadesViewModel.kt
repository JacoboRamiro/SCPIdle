package com.example.scpidle.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.scpidle.data.DatosEjemplo
import com.example.scpidle.ui.components.TarjetaSkillData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class HabilidadesUiState(
    val habilidades: List<TarjetaSkillData> = emptyList()
)

class HabilidadesViewModel : ViewModel() {
    private val _estado = MutableStateFlow(
        HabilidadesUiState(
            habilidades = DatosEjemplo.skills.map { skill ->
                TarjetaSkillData(
                    nombre = skill.nombre,
                    nivel = skill.nivel,
                    experiencia = skill.experiencia,
                    experienciaSiguienteNivel = skill.experienciaSiguienteNivel
                )
            }
        )
    )
    val estado: StateFlow<HabilidadesUiState> = _estado.asStateFlow()
}
