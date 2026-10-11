fun addNumbers(number1:Int,number2:Int):Int{
    val sum=number1+number2
    return sum
    
}
fun addNumbers(number1:String,number2:String):Int{
    val sum=number1.toInt()+number2.toInt()
    return sum
}

fun main(){
    println(addNumbers(18,24))
    println(addNumbers("24","13"))
}