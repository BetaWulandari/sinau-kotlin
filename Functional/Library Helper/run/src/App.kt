// main function
fun main() {
    val text = "beta"
    val result = text.run {
        val from = this
        val to = this.replace("beta", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}