import java.io.ByteArrayOutputStream
import java.io.PrintStream

class AIStudentTest {
    fun aiLearnPrintsItsParameters() {
        val originalOutput = System.out
        val capturedOutput = ByteArrayOutputStream()

        try {
            System.setOut(PrintStream(capturedOutput))
            val student: AIStudent = GenAIStudent()
            student.aiLearn(10, 20, true)
            student.aiLearn(-3, 0, false)
        } finally {
            System.setOut(originalOutput)
        }

        val output = capturedOutput.toString().lineSequence()
            .filter { it.isNotEmpty() }
            .toList()
        val expected = listOf(
            "GenAIStudent is learning.",
            "Values: 10 and 20",
            "Should learn: true",
            "GenAIStudent is learning.",
            "Values: -3 and 0",
            "Should learn: false"
        )

        check(output == expected) {
            "aiLearn should print the message and all parameter values"
        }
    }
}

fun main() {
    AIStudentTest().aiLearnPrintsItsParameters()
    println("AIStudentTest: passed")
}
