class StudentStreamTest {
    fun populateStudentsCreatesExpectedStreamSizes() {
        val studentStream = StudentStream()

        check(studentStream.populateStudents("ba").size == 100)
        check(studentStream.populateStudents("bcom").size == 55)
        check(studentStream.populateStudents("bsc").size == 75)
    }

    fun populateStudentsRejectsUnsupportedStreams() {
        val exception = runCatching {
            StudentStream().populateStudents("engineering")
        }.exceptionOrNull()

        check(exception is IllegalArgumentException)
    }

    fun populateStudentsPreservesThreadInterruption() {
        Thread.currentThread().interrupt()
        try {
            val exception = runCatching {
                StudentStream().populateStudents("ba")
            }.exceptionOrNull()

            check(exception is InterruptedException)
            check(Thread.currentThread().isInterrupted)
        } finally {
            Thread.interrupted()
        }
    }
}

fun main() {
    val test = StudentStreamTest()
    test.populateStudentsCreatesExpectedStreamSizes()
    test.populateStudentsRejectsUnsupportedStreams()
    test.populateStudentsPreservesThreadInterruption()
    println("StudentStreamTest: passed")
}
