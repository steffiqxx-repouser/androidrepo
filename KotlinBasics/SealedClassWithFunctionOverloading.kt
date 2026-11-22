sealed class SealedClassWithFunctionOverloading {
    open fun describe(value: Int): String = "Base integer: $value"

    open fun describe(value: String): String = "Base text: $value"
}

class FunctionOverloadingImplementation : SealedClassWithFunctionOverloading() {
    override fun describe(value: Int): String = "Integer: $value"

    override fun describe(value: String): String = "Text: $value"
}

fun main() {
    val example: SealedClassWithFunctionOverloading =
        FunctionOverloadingImplementation()

    check(example.describe(42) == "Integer: 42")
    check(example.describe("Kotlin") == "Text: Kotlin")

    println(example.describe(42))
    println(example.describe("Kotlin"))
}
