package uticodes.tutorials.kmmnoteappwithsqldelight.android.di

import android.app.Application
import uticodes.tutorials.kmmnoteappwithsqldelight.data.local.DatabaseDriverFactory
import uticodes.tutorials.kmmnoteappwithsqldelight.data.note.SqlDelightNoteDataSource
import uticodes.tutorials.kmmnoteappwithsqldelight.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uticodes.tutorials.kmmnoteappwithsqldelight.NoteDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun provideNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}