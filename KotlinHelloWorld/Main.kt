fun main() {
    printHelloWorld()
    printScores()
    printStudentSubjects()
    println( greet("steffi"))
    println(add(42,38))
    println(printDetails(24))
} 

fun add(a: Int, b: Int):Int { return a + b
//downright fraud is 75,27,35 ask that what they call that scorpio shahrukh khan from where he took the money in dubai 
//to make a home in dubai

//thats a 7 ,one of the reasons that more whoric taurus anushka sharma is her ardent devotee,same goes for that varun dhawan
}

fun printDetails(age:Int):String{
    if(age<18){
        return "student passed with 83.37%"
    }
    return "adult faced hidden demonic not outright demonic " + 
            "children based students passed with 99.95%  and and got education and" + 
                    " home loan at 7.5% and got married at 27 years of age"
}
fun printHelloWorld() {
    println("Hello, World!")
}
fun greet(name: String): String {
    return "Hello $name"
}
fun printScores() {
    val scores: Map<String, Int> = mapOf(
        "Alice" to 42,
        "Bob" to 37,
        "Charlie" to 38
    )

    for ((name, score) in scores) { 
        println("$name -> $score")
    }
}

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

