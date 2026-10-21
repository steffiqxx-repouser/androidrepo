data class User(val firstName:String,val lastName:String,val age:Int)
fun main(){
    val user:User? = null
    
    val result=user?.run{
        println(firstName)
        println(lastName)
        println(age)

    }
   // with(user){
    //    println(firstName)
   //     println(lastName)
    //    println(age)


   // }
}