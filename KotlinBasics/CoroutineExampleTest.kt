import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val events = mutableListOf<String>()

    performFakeWork(
        workDelayMillis = 0,
        output = events::add,
        threadName = { "test-thread" }
    )

    check(events == listOf(
        "Fake work started: test-thread",
        "Fake work finished: test-thread"
    )) { "Unexpected coroutine lifecycle events: $events" }

    check(FAKE_WORK_DELAY_MILLIS == 2000L) {
        "Expected the default delay to be 2000 ms"
    }

    println("CoroutineExampleTest: passed")
}
