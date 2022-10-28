package com.iehapp.mynoteapp.featureNote.domain.useCase

import com.iehapp.mynoteapp.featureNote.domain.model.Note
import com.iehapp.mynoteapp.featureNote.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: Note) {
        repository.deleteNote(note)
    }
}