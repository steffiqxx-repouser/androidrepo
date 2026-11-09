sealed class Result<out T>
data class Success<T>(
    val data: T
) : Result<T>()

val r: Result<Number> = Success(42)
fun main(){
    
    var result=Success(42)
    println(result)
}