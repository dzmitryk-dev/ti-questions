
fun main() {

    var invokeCounterSequence = 0
    var invokeCounterList = 0

    sequenceOf(1, 2, 3, 4, 5)
        .onEach { invokeCounterSequence++ }
        .map { it * it }
        .onEach { invokeCounterSequence++ }
        .filter { it % 2 == 0 }
        .onEach { invokeCounterSequence++ }
        .first()
        .let { println(it) }

    listOf(1, 2, 3, 4, 5)
        .onEach { invokeCounterList++ }
        .map { it * it }
        .onEach { invokeCounterList++ }
        .filter { it % 2 == 0 }
        .onEach { invokeCounterList++ }
        .first()
        .let { println(it) }

    println("Sequence invoke counter: $invokeCounterSequence")
    println("List invoke counter: $invokeCounterList")
}

