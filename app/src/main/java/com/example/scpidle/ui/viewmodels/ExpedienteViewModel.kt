package com.example.scpidle.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.scpidle.R
import com.example.scpidle.data.DatosEjemplo
import com.example.scpidle.ui.components.SeccionExpedienteData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class ExpedienteUiState(
    val codigo: String = "",
    val nombre: String = "",
    val clase: String = "",
    val secciones: List<SeccionExpedienteData> = emptyList(),
    val autor: String = "",
    val enlace: String = ""
)

class ExpedienteViewModel : ViewModel() {
    private val _estado = MutableStateFlow(
        DatosEjemplo.entidad.let { entidad ->
            ExpedienteUiState(
                codigo = entidad.codigo,
                nombre = entidad.nombre,
                clase = entidad.clase,
                secciones = listOf(
                    SeccionExpedienteData(R.string.expediente_contencion, entidad.contencion),
                    SeccionExpedienteData(R.string.expediente_descripcion, entidad.descripcion)
                ),
                autor = entidad.autor,
                enlace = entidad.enlace
            )
        }
    )
    val estado: StateFlow<ExpedienteUiState> = _estado.asStateFlow()
}
