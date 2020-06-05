/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
fun main() {
    val kotlin = "Kotlin".getFirstAndLast()
    val dicoding = "Dicoding".getFirstAndLast()

    val kotlinFirstChar = kotlin["first"]
    val kotlinLastChar = kotlin["last"]

    val dicodingFirstChar = dicoding["first"]
    val dicodingLastChar = dicoding["last"]

    println("First char Kotlin is $kotlinFirstChar and $kotlinLastChar for second letter")
    println("First char Dicoding is $dicodingFirstChar and $dicodingLastChar for second letter")

}

// TODO\
fun String.getFirstAndLast(): Map<String, Char>{
    val first_id = "first"
    val last_id = "last"
    val first = this.first()
    val last = this.last()


    return mapOf(first_id to first, last_id to last)
}