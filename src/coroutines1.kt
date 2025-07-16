import kotlinx.coroutines.*

suspend fun main(): Unit = coroutineScope {
    launch {
        Thread.sleep(3000) //emulate long work
        println("1")
    }
    launch {
        Thread.sleep(2000) //emulate long work
        println("2")
    }
    launch {
        Thread.sleep(1000) //emulate long work
        println("3")
    }
}