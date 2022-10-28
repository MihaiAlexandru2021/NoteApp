package com.iehapp.mynoteapp.featureNote.domain.useCase

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNotes: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)
