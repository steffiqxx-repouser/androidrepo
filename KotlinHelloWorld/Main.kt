fun main() {
    printHelloWorld()
    printScores()
    printStudentSubjects()
}

fun printHelloWorld() {
    println("Hello, World!")
}

fun printScores() {
    val scores: Map<String, Int> = mapOf(
        "Alice" to 42,
        "Bob" to 37,
        "Charlie" to 38
    )

    for ((name, score) in scores) { 
        println("$name -> $score")
    }
}

fun printStudentSubjects() {
    val studentSubjects: Map<String, List<String>> = mapOf(
        "Alice" to listOf("abc", "def", "ghi"),
        "Bob" to listOf("jkl", "mno"),
        "Charlie" to listOf("pqr", "stv")
    )

    for ((student, subjects) in studentSubjects) {
        println("Student: $student")

        for (subject in subjects) {
            println("  - $subject")
        }
    }
}
