fun main(args:Array<String>){
    val a=55
    val b=2.7
    try{
        println(a/b)
    }catch(e:ArithmeticException){
        println("you cant divide blackhole by blackhole")
    }
}