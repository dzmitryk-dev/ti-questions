import kotlinx.coroutines.*

suspend fun main(): Unit = coroutineScope {
    var proccessedItems = 0
    coroutineScope {
        withContext(Dispatchers.Default) {
            repeat(1000) {
                launch {
                    repeat(1000) {
                        delay(1)
                        proccessedItems += 1
                    }
                }
            }
        }
    }
    println(proccessedItems)
}