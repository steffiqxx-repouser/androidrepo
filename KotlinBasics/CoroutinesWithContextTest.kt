import kotlinx.coroutines.runBlocking

class CoroutinesWithContextTest {
    suspend fun loadMessageReturnsExpectedMessage() {
        check(loadMessage() == "Coroutines are running") {
            "loadMessage should return the expected message"
        }
    }

    suspend fun formatMessageReturnsUppercaseMessage() {
        check(formatMessage("Coroutines are running") == "COROUTINES ARE RUNNING") {
            "formatMessage should return the message in uppercase"
        }
    }
}

fun main() = runBlocking {
    val tests = CoroutinesWithContextTest()

    tests.loadMessageReturnsExpectedMessage()
    tests.formatMessageReturnsUppercaseMessage()

    println("CoroutinesWithContextTest: passed")
}
