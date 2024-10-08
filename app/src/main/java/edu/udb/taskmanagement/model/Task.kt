package edu.udb.taskmanagement.model

import java.util.Date

data class Task(
    val id: Int,              // Identificador único de la tarea
    val title: String,          // Título del recurso
    val description: String,    // Descripción del recurso
    val dueDate: String,          // Esta vez no utilizaré los mismo datos, este va a ser ocupado para el tipo
    val priority: String,        // ocuapado para ser el link del recurso
    val image: String? // URL de la imagen, la voy a tomar como link para ser consumida y mostrada por la api
)