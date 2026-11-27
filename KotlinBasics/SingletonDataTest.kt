class SingletonDataTest {
    fun populatesSelectedWeekdays() {
        SingletonData.populateDataFromEnum(listOf(0, 2, 6), "available")

        check(
            SingletonData.data == mapOf(
                TimeSpanEnum.MONDAY to "available",
                TimeSpanEnum.WEDNESDAY to "available",
                TimeSpanEnum.SUNDAY to "available"
            )
        ) {
            "Indexes should map from Monday at 0 through Sunday at 6"
        }
    }

    fun rejectsIndexSevenWithoutChangingExistingData() {
        SingletonData.populateDataFromEnum(listOf(1), "existing")
        val existingData = SingletonData.data

        val rejected = try {
            SingletonData.populateDataFromEnum(listOf(7), "new")
            false
        } catch (_: IllegalArgumentException) {
            true
        }

        check(rejected) { "Index 7 should be rejected because there are seven weekdays" }
        check(SingletonData.data == existingData) {
            "Invalid indexes should not modify previously populated data"
        }
    }
}

fun main() {
    val test = SingletonDataTest()
    test.populatesSelectedWeekdays()
    test.rejectsIndexSevenWithoutChangingExistingData()
    println("SingletonDataTest: passed")
}
