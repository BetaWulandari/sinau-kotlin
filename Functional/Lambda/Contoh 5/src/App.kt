// main function
fun main() {
    val message = buildString {
        append("bets" )
        append(" from ")
        append("lambda ")
    }

    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}