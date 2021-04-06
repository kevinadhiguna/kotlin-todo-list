package com.example.todolist

// data class is a class whose primary purpose is to hold data. Hence, no logic presents here.

data class Todo (
    val title: String,
    var isChecked: Boolean = false
)
