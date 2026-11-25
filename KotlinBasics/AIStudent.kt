abstract class AIStudent {
    abstract fun aiLearn(firstValue: Int, secondValue: Int, shouldLearn: Boolean)
}

class GenAIStudent : AIStudent() {
    override fun aiLearn(firstValue: Int, secondValue: Int, shouldLearn: Boolean) {
        println("GenAIStudent is learning.")
        println("Values: $firstValue and $secondValue")
        println("Should learn: $shouldLearn")
    }
}

fun main() {
    val student: AIStudent = GenAIStudent()
    student.aiLearn(10, 20, true)
}
