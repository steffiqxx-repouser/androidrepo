import java.io.ByteArrayOutputStream
import java.io.PrintStream

class GenAIClassTest {
    fun teachingGenAiPrintsExpectedMessage() {
        val originalOutput = System.out
        val capturedOutput = ByteArrayOutputStream()

        try {
            System.setOut(PrintStream(capturedOutput))
            val teacher: GenAIClass = GenAITeacher()
            teacher.teachingGenAi()
        } finally {
            System.setOut(originalOutput)
        }

        check(capturedOutput.toString().trim() == "Teaching Generative AI") {
            "teachingGenAi should print the expected message"
        }
    }
}

fun main() {
    GenAIClassTest().teachingGenAiPrintsExpectedMessage()
    println("GenAIClassTest: passed")
}
