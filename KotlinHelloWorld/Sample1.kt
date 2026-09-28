fun main(){
    println((10*10-55-57))
    println(print())
    println(check())
}
fun print(){
    var a=10*10
    calculate(a)
    println(a)
}

fun calculate(a:Int){
    
    var a=a*10
    multiply(a)
    println(a)
}
fun multiply(a:Int):Boolean{
    var a=a*22.222
    println(a)
        
        if(a>10){
            return true
        }
        return false
}

fun check():Boolean{
    var a=10
    if(a>75)
    return true
    else return false
}