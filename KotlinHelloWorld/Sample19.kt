class User{
    private var firstName=" "
    var lastName=" "
    
    fun updateName(newName:String){
        firstName=newName
    }
}

fun main(){
    val user=User()
    user.firstName="Alex"
    user.lastName="manchester united former manager"
}
/**
 * 
 * PS C:\Users\STEFFI\Downloads\KotlinHelloWorld> kotlinc Sample19.kt -include-runtime -d sample19.jar
Sample19.kt:12:10: error: cannot access 'var firstName: String': it is private in 'User'.
    user.firstName="Alex"
         ^^^^^^^^^
 */