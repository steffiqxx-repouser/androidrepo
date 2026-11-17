import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main() {

    CoroutineScope(Dispatchers.Default).launch {
        println("Fake work started: ${Thread.currentThread().name}")

        Thread.sleep(2000)

        println("Fake work finished: ${Thread.currentThread().name}")
    }

    Thread.sleep(3000)
}
