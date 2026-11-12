inline fun <reified T> printType(value: Array<out T>){
    println(T::class.simpleName)
    //println(T::toString())
}

fun main(){
    
printType(arrayOf(42, 37))
printType(arrayOf("hi"))
printType(arrayOf(37))
println(arrayOf(42,37).toString())

}
