package uticodes.tutorials.kmmnoteappwithsqldelight.di

import uticodes.tutorials.kmmnoteappwithsqldelight.NoteDatabase
import uticodes.tutorials.kmmnoteappwithsqldelight.data.local.DatabaseDriverFactory
import uticodes.tutorials.kmmnoteappwithsqldelight.data.note.SqlDelightNoteDataSource
import uticodes.tutorials.kmmnoteappwithsqldelight.domain.note.NoteDataSource

class DatabaseModule {

    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}