fun main(args:Array<String>){
   var result=Calculator.sum(55,57) 
   val max=Int.MAX_VALUE
   println(result)
}

class Calculator(){
    companion object{
        fun sum(a:Int,b:Int):Int{
            return a+b
        }
    }
}