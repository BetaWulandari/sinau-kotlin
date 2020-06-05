class Animal(val name: String, val weight: Double, val age: Int = 0, val isMammal: Boolean = false)

fun main() {
  //  val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    val dicodingCat = Animal("Dicoding Miaw", 4.2, isMammal =  true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}