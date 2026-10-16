fun main(){
    val numbers=listOf(42,37,57,27,22,21)
    val numbers1=mutableListOf(1,2,3,4,43,32)
    println(numbers)
    println(numbers1)
    //PS C:\Users\STEFFI\Downloads\KotlinHelloWorld> kotlinc Sample17.kt -include-runtime -d sample17.jar
//Sample17.kt:6:13: error: unresolved reference 'add' on receiver of type 'List<Int>'.
    //numbers.add(21)
            
   // numbers.add(21)
    numbers1.add(24)
    println(numbers)
    println(numbers1)
    //difference between listOf and mutableListOf in kotlin
   
}