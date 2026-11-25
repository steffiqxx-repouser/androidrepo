import java.io.ByteArrayOutputStream
import java.io.PrintStream

class StreamSelectionTest {
    fun streamSelectionPrintsProvidedStreams() {
        val streams = listOf(
            "BA",
            "BCOM",
            "BSC",
            "MEDIA AND ARTS",
            "ANIMATION",
            "CREATIVE VISIONARY",
            "SALES AND MARKETING",
            "EQUIPMENT SPECIALISTS"
        )
        val output = captureOutput {
            StreamSelection().streamSelection(streams)
        }

        check(output == listOf("Available streams:") + streams) {
            "streamSelection should print the heading and every provided stream"
        }
    }

    fun streamSelectionHandlesAnEmptyList() {
        val output = captureOutput {
            StreamSelection().streamSelection(emptyList())
        }

        check(output == listOf("Available streams:")) {
            "streamSelection should print the heading when no streams are provided"
        }
    }

    private fun captureOutput(action: () -> Unit): List<String> {
        val originalOutput = System.out
        val capturedOutput = ByteArrayOutputStream()

        try {
            System.setOut(PrintStream(capturedOutput))
            action()
        } finally {
            System.setOut(originalOutput)
        }

        return capturedOutput.toString().lineSequence().filter { it.isNotEmpty() }.toList()
    }
}

fun main() {
    val test = StreamSelectionTest()
    test.streamSelectionPrintsProvidedStreams()
    test.streamSelectionHandlesAnEmptyList()
    println("StreamSelectionTest: passed")
}
