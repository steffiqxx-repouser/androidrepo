fun main(args:Array<String>){
    val user=User("Alex")
    val friend=User("John","Smith",37)
    println(user.lastName)
    println(friend.lastName)
    Thread.sleep(2727)
    println(user.name)
    println(user.name)


    
}

class User(var name:String,var lastName:String,var age:Int){
    constructor(name:String): this(name,"def",60)
}