package uticodes.tutorials.kmmnoteappwithsqldelight

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform