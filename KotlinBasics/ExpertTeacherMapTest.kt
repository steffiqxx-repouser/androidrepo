import java.io.ByteArrayOutputStream
import java.io.PrintStream

class ExpertTeacherMapTest {
    fun mainPrintsTwelveTeacherExpertPairs() {
        val originalOutput = System.out
        val capturedOutput = ByteArrayOutputStream()

        try {
            System.setOut(PrintStream(capturedOutput))
            Class.forName("ExpertTeacherMapKt").getMethod("main").invoke(null)
        } finally {
            System.setOut(originalOutput)
        }

        val expected = "{Teacher1=Expert1, Teacher2=Expert2, Teacher3=Expert3, " +
            "Teacher4=Expert4, Teacher5=Expert5, Teacher6=Expert6, " +
            "Teacher7=Expert7, Teacher8=Expert8, Teacher9=Expert9, " +
            "Teacher10=Expert10, Teacher11=Expert11, Teacher12=Expert12}"

        check(capturedOutput.toString().trim() == expected) {
            "main should print all twelve teacher-to-expert pairs"
        }
    }
}

fun main() {
    ExpertTeacherMapTest().mainPrintsTwelveTeacherExpertPairs()
    println("ExpertTeacherMapTest: passed")
}
