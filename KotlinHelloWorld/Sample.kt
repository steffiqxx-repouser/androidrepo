fun main(){
    var num=10
    println("num ->$num");
    println("calculate "+calculate());
    println("add "+add(38,42));
    println("subtract "+subtract(42,37))
    println("multiply "+multiply(10,10))
    println("division "+divide(10,2))
    println("concatenated string is "+concat("abc","def"))
    println("abc "+"def "+(10*10)+"ghi")
    println((10*10))
}

fun calculate(){
    var a=10;
    var b=10;
    var c=a*b;
    println("c->$c")
}
fun add(a:Int,b:Int):Int{
    return a+b
   
}
fun subtract(a:Int,b:Int):Int{
    println(multiply(10,10))
    if(a>b)
    return a-b
    else 
    return b-a
}

fun multiply(a:Int,b:Int):Int{
    return a*b
}
fun divide(a:Int,b:Int):Int{
    return a/b
}
fun concat(a:String,b:String):String{
    //var a="abc"
    //var b=25
    //var c=a+b
    //println(c) //easy door to 10 lacs personal loan, 9.95% personal loan,11.75% 
    //personal loans
    //astroyogi app subscription with 10 lacs personal loan,9.95% personal loan and "11.75%" personal loan
    //and what they say wow wow "happy life" no no,wrong ,"happily ever after"
    return a+b
}