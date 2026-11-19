import java.io.ByteArrayOutputStream
import java.io.PrintStream

fun main() {
    val originalOutput = System.out
    val capturedOutput = ByteArrayOutputStream()

    try {
        System.setOut(PrintStream(capturedOutput))
        Calculator(91, 72).add()
    } finally {
        System.setOut(originalOutput)
    }

    check(capturedOutput.toString().trim() == "163")

    println("MainFunctionCallWithClassMethod_1Test: passed")
}
