package uticodes.tutorials.kmmnoteappwithsqldelight.data.note

import uticodes.tutorials.kmmnoteappwithsqldelight.domain.note.Note
import uticodes.tutorials.kmmnoteappwithsqldelight.domain.time.DateTimeUtil
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun NoteEntity.toNote(): Note {
    return Note(
        id = id,
        title = title,
        content = content,
        colorHex = colorHex,
        created = Instant
            .fromEpochMilliseconds(created)
            .toLocalDateTime(TimeZone.currentSystemDefault())
    )
}