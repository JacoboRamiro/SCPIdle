package com.example.scpidle.data

import com.example.scpidle.data.model.Skill
import com.example.scpidle.data.model.Vida

// Datos fijos para ver las pantallas mientras no hay persistencia (tema 4)
object DatosEjemplo {
    val skills = listOf(
        Skill("Percepción", 4, 120, 200),
        Skill("Conocimiento", 2, 30, 100),
        Skill("Resistencia", 3, 150, 200),
        Skill("Hacking", 1, 15, 100)
    )

    val vidas = listOf(
        Vida(12, "30/09/2026", 9, "SCP-173", "Correr"),
        Vida(11, "29/09/2026", 7, "SCP-173", "Investigar"),
        Vida(10, "29/09/2026", 6, "SCP-173", "Reparar")
    )
}
