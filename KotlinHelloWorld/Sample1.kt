fun main(){
    println((10*10-55-57))
    println(print())
    println(check())
    printScores()
    printStudentSubjects()
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
    if(a>75.27)
    return true
    else return false
}
fun printScores() {
    val scores: Map<String, Int> = mapOf(
        "Alice" to 42,
        "Bob" to 37,
        "Charlie" to 38
    )

    for ((name, score) in scores) { 
        //scores.get("Bob")?.plus(36)
        println("$name -> $score")
    }
}
//55.57 has 
//consummated their illegal marriages which led to more illegal children and those
// illegal children are at the proper illegal places
//the brilliance of 55 and 57 which yields never ending money more than like 
//actual billionaires
fun printStudentSubjects() {
    val studentSubjects: Map<String, List<String>> = mapOf(
        "Alice" to listOf("abc", "def", "ghi"),
        "Bob" to listOf("jkl", "mno"),
        "Charlie" to listOf("pqr", "stv")
    )

    for ((student, subjects) in studentSubjects) {
        println("Student: $student")

        for (subject in subjects) {
            println("  - $subject")
        }
    }
}







