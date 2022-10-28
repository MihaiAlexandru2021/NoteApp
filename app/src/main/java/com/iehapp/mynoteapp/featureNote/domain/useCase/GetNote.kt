package com.iehapp.mynoteapp.featureNote.domain.useCase

import com.iehapp.mynoteapp.featureNote.domain.model.Note
import com.iehapp.mynoteapp.featureNote.domain.repository.NoteRepository

class GetNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(id: Int): Note?  {
        return repository.getNoteById(id)
    }
}