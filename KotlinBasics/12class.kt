class StreamSelection {
    fun streamSelection(streams: List<String>) {
        println("Available streams:")
        streams.forEach { stream ->
            println(stream)
        }
    }
}

fun main() {
    val streams = listOf(
        "BA",
        "BCOM",
        "BSC",
        "MEDIA AND ARTS",
        "ANIMATION",
        "CREATIVE VISIONARY",
        "SALES AND MARKETING",
        "EQUIPMENT SPECIALISTS"
    )

    StreamSelection().streamSelection(streams)
}
