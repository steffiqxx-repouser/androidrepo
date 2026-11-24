import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ComparatorDemoTest {
    fun demonstrateSortsStudentsWithCustomComparators() {
        val originalOutput = System.out
        val capturedOutput = ByteArrayOutputStream()

        try {
            System.setOut(PrintStream(capturedOutput))
            ComparatorDemo().demonstrate()
        } finally {
            System.setOut(originalOutput)
        }

        val expected = listOf(
            "Students sorted by name: " +
                "[ComparatorStudent(name=Alex, score=95), " +
                "ComparatorStudent(name=Mina, score=82), " +
                "ComparatorStudent(name=Sam, score=82)]",
            "Students sorted by score, then name: " +
                "[ComparatorStudent(name=Alex, score=95), " +
                "ComparatorStudent(name=Mina, score=82), " +
                "ComparatorStudent(name=Sam, score=82)]"
        ).joinToString(System.lineSeparator())
        check(capturedOutput.toString().trim() == expected) {
            "ComparatorDemo should sort by name and by descending score then name"
        }
    }
}

fun main() {
    ComparatorDemoTest().demonstrateSortsStudentsWithCustomComparators()
    println("ComparatorDemoTest: passed")
}
