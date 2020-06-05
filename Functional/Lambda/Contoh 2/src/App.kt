// main function
fun main() {
    val length = messageLength("Hello beta")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }