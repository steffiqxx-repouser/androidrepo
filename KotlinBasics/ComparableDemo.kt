data class ComparableStudent(
    val name: String,
    val score: Int
) : Comparable<ComparableStudent> {
    override fun compareTo(other: ComparableStudent): Int =
        score.compareTo(other.score)
}

class ComparableDemo {
    fun demonstrate() {
        val students = listOf(
            ComparableStudent("Mina", 82),
            ComparableStudent("Alex", 95),
            ComparableStudent("Sam", 74)
        )

        println("Students sorted by score (natural order): ${students.sorted()}")
    }
}

fun main() {
    ComparableDemo().demonstrate()
}
