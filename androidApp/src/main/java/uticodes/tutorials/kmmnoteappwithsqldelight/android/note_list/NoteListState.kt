package uticodes.tutorials.kmmnoteappwithsqldelight.android.note_list

import uticodes.tutorials.kmmnoteappwithsqldelight.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
