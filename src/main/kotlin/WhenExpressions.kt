//When Expressions
fun main() {
    val value = 7
    when(value){
        5 -> println("value is 5")
        6 -> println("value is 6")
        7 -> println("value is 7")
    }
}
/*\
*Menambahkan Else Pada When
fun main() {
    val value = 2
    when(value){
        5 -> println("value is 5")
        6 -> println("value is 6")
        7 -> println("value is 7")
        else -> println("value can't be reached")
    }
}

* When Dimasukkan ke dalam variabel
fun main() {
    val value = 8
    val stringOfValue = when(value){
        5 -> println("value is 5")
        6 -> println("value is 6")
        7 -> println("value is 7")
        else -> println("value can't be reached")
    }
    println(stringOfValue)
}

* Untuk Mendapatkan 2 baris kode menggunakan curly braces
fun main() {
    val value = 7
    val ValueOfString = when(value){
        5 -> {
            println("value is 5")
            "5"
        }
        6 -> {
            println("value is 6")
            "6"
        }
        7 -> {
            println("value is 7")
            "7"
        }
        else -> {
            println("value can't be reached")
            "error!"
        }

    }
    println(ValueOfString)
}

* When Untuk Mengecek Instance
fun main() {
    val value: Any = 7L
    when(value) {
        is Long -> println("the value has a Long Type")
        is String -> println("the value has a String Type")
        else -> println("Undefined")
    }
}

* When Untuk Penggunaan Range (Range Fungsi Khusus Pada Kotlin)
fun main() {
    val value = 7
    val range = 1..10
    when(value) {
        in range -> println("value is in range")
        !in range -> println("value is outside the range")
        else -> println("value undefined")
    }
}


*/