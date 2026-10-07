fun main(args:Array<String>){
    val text="text"
    val myLambda={a:Int,b:Int ->println("a+b=${a+b}")}
    myLambda(24,14)
}
fun add(a:Int,b:Int,action:(Int)->Unit){
    println("a+b=${a+b}")
   
}
