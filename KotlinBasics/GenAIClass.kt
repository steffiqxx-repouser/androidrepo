abstract class GenAIClass {
    abstract fun teachingGenAi()
}

class GenAITeacher : GenAIClass() {
    override fun teachingGenAi() {
        println("Teaching Generative AI")
    }
}

fun main() {
    val teacher: GenAIClass = GenAITeacher()
    teacher.teachingGenAi()
}
