package com.example.scpidle.data

import com.example.scpidle.data.model.Entidad
import com.example.scpidle.data.model.Skill
import com.example.scpidle.data.model.Vida

// Datos fijos para ver las pantallas mientras no hay persistencia (tema 4)
// ni descarga de expedientes (tema 5)
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

    val entidad = Entidad(
        codigo = "SCP-173",
        nombre = "La Escultura",
        clase = "Euclid",
        descripcion = "Estatua de hormigón que no se mueve mientras alguien la observa, " +
                "pero que ataca en cuanto se pierde el contacto visual con ella.",
        contencion = "Debe permanecer en una sala cerrada. Al entrar, al menos ██ personas " +
                "mantienen contacto visual con ella en todo momento. ████████████.",
        autor = "Moto42",
        enlace = "https://scp-wiki.wikidot.com/scp-173"
    )
}