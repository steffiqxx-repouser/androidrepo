fun main(args:Array<String>){
    val calculator=Calculator()
    val result=calculator.sum(22,27)
    println(result)
}
class Calculator(){
    fun sum(a:Int,b:Int):Int{
        return a+b
    }
}