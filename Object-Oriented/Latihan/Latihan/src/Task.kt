import kotlin.reflect.KMutableProperty
import kotlin.reflect.KProperty

/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah kode yang sudah ada.
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */
class tidur{
    private var value: String = "Default"
    operator fun getValue(Cat: Any?, property: KProperty<*>) : String {
      //  println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        println("setter")
        return value
    }

    operator fun setValue(Cat: Any?, property: KProperty<*>, newValue: String){
      //  println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
     //   println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        println("setter")
        value = newValue
    }

}



class Cat (private val name: String) {
    // TODO 1

    var sleep: Boolean = false


    fun toSleep() {

        if (sleep == true){
            println("$name, sleep!")
        } else {
            println("$name, let's play")
        }
    }
}

fun main() {

    // TODO 2

    val gippy = Cat("Gippy")


    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}