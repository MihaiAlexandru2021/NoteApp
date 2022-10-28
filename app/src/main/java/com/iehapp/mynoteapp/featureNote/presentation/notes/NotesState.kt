package com.iehapp.mynoteapp.featureNote.presentation.notes

import com.iehapp.mynoteapp.featureNote.domain.util.NoteOrder
import com.iehapp.mynoteapp.featureNote.domain.util.OrderType

data class NotesState(
    val notes: List<com.iehapp.mynoteapp.featureNote.domain.model.Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)