class User(firstName:String,var lastName:String="LastName",var age:Int=0){
    var firstName=firstName
    get(){
        return "FirstName: $field"
    }
    set(value){
        println("$value was assigned to firstname property")
        field=value
    }
}
fun main(){
    val user=User("whale 1")
    val friend=User("whale 2","Smith")
    val user2=User(age=99, firstName = "Ioana", lastName = "Dobbi")
    println(user.firstName)
    println(user.lastName)
    println(user.age)
    println("\n")
    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)


}