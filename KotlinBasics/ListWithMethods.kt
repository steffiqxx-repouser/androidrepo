class ListWithMethods {
    val listOfExample: List<String> = listOf("Kotlin", "Java")

    val mutableListOfExample: MutableList<String> =
        mutableListOf("Kotlin", "Java")

    val buildListExample: List<String> = buildList {
        add("Kotlin")
        add("Java")
    }
}

fun main() {
    val examples = ListWithMethods()

    println("listOf: ${examples.listOfExample}")
    println("mutableListOf: ${examples.mutableListOfExample}")
    println("buildList: ${examples.buildListExample}")
}
