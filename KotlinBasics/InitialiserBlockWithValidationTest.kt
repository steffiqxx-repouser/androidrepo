fun main() {
    check(BankAccount("Alex", 995.0).bal == 995.0)
    check(BankAccount("Alex", 0.0).bal == 0.0)

    check(runCatching { BankAccount(" ", 10.0) }.exceptionOrNull()?.message == "Name needed")
    check(runCatching { BankAccount("Alex", -1.0) }.exceptionOrNull()?.message == "Balance negative")

    println("InitialiserBlockWithValidationTest: passed")
}
