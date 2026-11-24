data class ComparatorStudent(
    val name: String,
    val score: Int
)

class ComparatorDemo {
    fun demonstrate() {
        val students = listOf(
            ComparatorStudent("Mina", 82),
            ComparatorStudent("Alex", 95),
            ComparatorStudent("Sam", 82)
        )

        val byName = compareBy<ComparatorStudent> { it.name }
        val byScoreThenName = compareByDescending<ComparatorStudent> { it.score }
            .thenBy { it.name }

        println("Students sorted by name: ${students.sortedWith(byName)}")
        println("Students sorted by score, then name: ${students.sortedWith(byScoreThenName)}")
    }
}

fun main() {
    ComparatorDemo().demonstrate()
}
