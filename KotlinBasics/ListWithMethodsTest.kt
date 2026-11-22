fun main() {
    val examples = ListWithMethods()
    val expected = listOf("Kotlin", "Java")

    check(examples.listOfExample == expected) {
        "listOfExample should contain $expected"
    }
    check(examples.buildListExample == expected) {
        "buildListExample should contain $expected"
    }

    examples.mutableListOfExample.add("Scala")
    check(examples.mutableListOfExample == expected + "Scala") {
        "mutableListOfExample should allow adding an item"
    }
    check(examples.listOfExample == expected) {
        "Changing mutableListOfExample should not change listOfExample"
    }
    check(examples.buildListExample == expected) {
        "Changing mutableListOfExample should not change buildListExample"
    }

    println("ListWithMethodsTest: passed")
}
