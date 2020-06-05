var message = "Kotlin"

fun main() {
    println(::message.get())
    println(::message.name)

    ::message.set("Kotlin Academy")

    println(::message.get())
}