import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ComparableDemoTest {
    fun demonstrateSortsStudentsByNaturalOrder() {
        val originalOutput = System.out
        val capturedOutput = ByteArrayOutputStream()

        try {
            System.setOut(PrintStream(capturedOutput))
            ComparableDemo().demonstrate()
        } finally {
            System.setOut(originalOutput)
        }

        val expected =
            "Students sorted by score (natural order): " +
                "[ComparableStudent(name=Sam, score=74), " +
                "ComparableStudent(name=Mina, score=82), " +
                "ComparableStudent(name=Alex, score=95)]"
        check(capturedOutput.toString().trim() == expected) {
            "ComparableDemo should sort students by ascending score"
        }
    }
}

fun main() {
    ComparableDemoTest().demonstrateSortsStudentsByNaturalOrder()
    println("ComparableDemoTest: passed")
}
