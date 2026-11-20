sealed class Result<out T> {
    fun resultType(): String = "Success"
}

data class Success<T>(
    val data: T
) : Result<T>() {
    fun printResult() {
        println("${resultType()}: $data")
    }
}

fun main() {
    val success = Success(42)
    val numericResult: Result<Number> = success

    success.printResult()
    check(success.data == 42)
    check(numericResult == Success(42))

    println("CovarianceWithSealedClassTest: passed")
}
