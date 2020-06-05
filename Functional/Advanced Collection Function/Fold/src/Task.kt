fun main() {
    val numbers = listOf(1, 2, 4)
    val fold = numbers.foldRight(11) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")
}