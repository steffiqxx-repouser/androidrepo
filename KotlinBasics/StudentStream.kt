data class Student(
    val id: Int,
    val name: String,
    val stream: String,
    val age: Int
)

class StudentStream {
    @Volatile
    private var populationInProgress = false

    fun populateStudents(stream: String): List<Student> {
        val normalizedStream = stream.trim().lowercase()
        if (normalizedStream !in setOf("ba", "bcom", "bsc")) {
            throw IllegalArgumentException("Stream must be ba, bcom, or bsc")
        }

        val studentCount = when (normalizedStream) {
            "ba" -> 100
            "bcom" -> 55
            "bsc" -> 75
            else -> error("Unsupported stream: $normalizedStream")
        }

        populationInProgress = true
        try {
            return (1..studentCount).map { id ->
                if (Thread.currentThread().isInterrupted) {
                    throw InterruptedException("Student population was interrupted")
                }

                Student(
                    id = id,
                    name = "${normalizedStream.uppercase()} Student $id",
                    stream = normalizedStream,
                    age = 18 + (id % 8)
                )
            }
        } catch (exception: InterruptedException) {
            Thread.currentThread().interrupt()
            throw exception
        } finally {
            populationInProgress = false
        }
    }
}
