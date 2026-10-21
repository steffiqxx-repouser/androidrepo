class User(){
    var firstName=""
    var lastName=""
    var age=-57
}

fun main(){
    val user=User().apply{
        firstName="abc"
        lastName="def"
        age=-78
    }
    
    with(user){
        println(firstName)
        println(lastName)
        println(age)
    }
}