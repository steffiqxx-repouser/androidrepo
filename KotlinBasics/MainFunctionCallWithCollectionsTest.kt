fun main() {
    val account = Account("abc")

    check(account.name == "abc")
    check(account == Account("abc"))
    check(account.copy(name = "xyz") == Account("xyz"))

    println("MainFunctionCallWithCollectionsTest: passed")
}
