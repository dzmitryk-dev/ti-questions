import kotlinx.coroutines.*

fun main() {
    var proccessedItems = 0

    runBlocking {
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