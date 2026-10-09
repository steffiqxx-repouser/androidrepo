data class Student (val name: String,val gpa: Double):Comparable<Student>{
    override fun compareTo(other:Student)=gpa.compareTo(other.gpa)
}


fun main(){
    
val students =listOf(Student("Alice",3.8),Student("Bob",3.5),Student("Carol",3.9))
val sorted=students.sorted()
    println(sorted)
}