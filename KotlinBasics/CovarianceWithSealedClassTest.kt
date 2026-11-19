fun main() {
    val success = Success(42)
    val numericResult: Result<Number> = success

    check(success.data == 42)
    check(numericResult == Success(42))

    println("CovarianceWithSealedClassTest: passed")
}
