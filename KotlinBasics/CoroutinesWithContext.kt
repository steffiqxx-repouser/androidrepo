import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

suspend fun loadMessage(): String = withContext(Dispatchers.IO) {
    println("Loading data on ${Thread.currentThread().name}")
    "Coroutines are running"
}

suspend fun formatMessage(message: String): String =
    withContext(Dispatchers.Default) {
        println("Formatting data on ${Thread.currentThread().name}")
        message.uppercase()
    }

fun main() = runBlocking {
    println("Starting on ${Thread.currentThread().name}")

    val message = loadMessage()
    val formattedMessage = formatMessage(message)

    println("Result: $formattedMessage")
    println("Back on ${Thread.currentThread().name}")
}
