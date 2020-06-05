fun main() {
    println("Factorial 3 is: ${factorial(3)}")
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial(n - 1)
    }
}