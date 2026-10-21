fun main(){
    val result=User("Alex","Dobinca",23).also{println(it)}
    
}

data class User(val firstName:String,val lastName:String,val age:Int)