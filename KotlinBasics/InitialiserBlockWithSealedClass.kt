sealed class InitialisationMessage {
    fun getMessage(): String = "Message from the sealed class"

    object Default : InitialisationMessage()
}

class InitialiserBlockWithSealedClass {
    val output: String

    init {
        output = InitialisationMessage.Default.getMessage()
    }
}

fun main() {
    val example = InitialiserBlockWithSealedClass()
    println(example.output)
}
