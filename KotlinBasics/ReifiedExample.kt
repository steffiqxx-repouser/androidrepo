inline fun <reified T> printType(value: T){
    println(T::class.simpleName)
}

fun main(){
    
printType(42)
printType("hi")
printType(37)
}