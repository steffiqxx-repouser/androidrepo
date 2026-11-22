fun main() {
    val example: SealedClassWithFunctionOverloading =
        FunctionOverloadingImplementation()

    check(example.describe(42) == "Integer: 42") {
        "The integer overload should dispatch to the subclass override"
    }
    check(example.describe("Kotlin") == "Text: Kotlin") {
        "The string overload should dispatch to the subclass override"
    }

    println("SealedClassWithFunctionOverloadingTest: passed")
}
