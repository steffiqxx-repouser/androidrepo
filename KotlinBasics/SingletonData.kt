enum class TimeSpanEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

object SingletonData {
    private val timeSpans = TimeSpanEnum.values()

    var data: Map<TimeSpanEnum, String> = emptyMap()
        private set

    fun populateDataFromEnum(indices: List<Int>, value: String) {
        require(indices.all { it in timeSpans.indices }) {
            "Weekday indexes must be between 0 and ${timeSpans.lastIndex}"
        }

        data = indices.associate { timeSpans[it] to value }
    }
}
