package com.iehapp.mynoteapp.featureNote.presentation.notes

import com.iehapp.mynoteapp.featureNote.domain.model.Note
import com.iehapp.mynoteapp.featureNote.domain.util.NoteOrder

sealed class NotesEvent {
    data class Order(val noteOrder: NoteOrder): NotesEvent()

    data class DeleteNote(val note: Note): NotesEvent()

    object RestoreNote: NotesEvent()

    object ToggleOrderSection: NotesEvent()
}
