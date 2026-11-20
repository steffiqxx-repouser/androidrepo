import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val employee = async {
        Employee(id = 1, name = "Alice")
    }.await()

    check(employee.id == 1)
    check(employee.name == "Alice")
    check(employee == Employee(id = 1, name = "Alice"))

    println("CoroutineWithDataTest: passed")
}
