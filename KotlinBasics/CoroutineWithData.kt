import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

data class Employee(val id: Int, val name: String)

fun main() = runBlocking {
    val employee = async {
        Employee(id = 1, name = "Alice")
    }.await()

    println(employee)
}
