package com.iehapp.mynoteapp.di

import android.app.Application
import androidx.room.Room
import com.iehapp.mynoteapp.featureNote.data.dataSource.NoteDao
import com.iehapp.mynoteapp.featureNote.data.dataSource.NoteDatabase
import com.iehapp.mynoteapp.featureNote.data.repositoty.NoteRepositoryImpl
import com.iehapp.mynoteapp.featureNote.domain.repository.NoteRepository
import com.iehapp.mynoteapp.featureNote.domain.useCase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatebase(app: Application): NoteDatabase {
        return Room.databaseBuilder(
            app,
            NoteDatabase::class.java,
            NoteDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: NoteDatabase): NoteRepository {
        return NoteRepositoryImpl(db.noteDao)
    }

    @Provides
    @Singleton
    fun provideNoteUseCases(repository: NoteRepository): NoteUseCases {
        return NoteUseCases(
            getNotes = GetNotes(repository),
            deleteNotes = DeleteNote(repository),
            addNote = AddNote(repository),
            getNote = GetNote(repository)
        )
    }
}