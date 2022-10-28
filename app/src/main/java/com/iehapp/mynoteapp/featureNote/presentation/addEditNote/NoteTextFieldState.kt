package com.iehapp.mynoteapp.featureNote.presentation.addEditNote

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)