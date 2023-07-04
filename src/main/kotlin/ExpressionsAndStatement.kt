//Percabangan Dengan Statement
fun main() {
    val open = 7
    val now = 9
    if ( open > now) {
        println("Toko Buka!")
    }else{
        println("Toko Tutup!")
    }
}
/*\
* Kondisi Di Rubah Ke Dalam Variabel
fun main() {
    val open = 7
    val now = 9
    val store = if ( open > now) "Toko Buka!" else "Toko Tutup!"
    println(store)
}

* Expression di dalam Expressions
fun main() {
    val value1 = 5
    val value2 = 7
    sum(value1, value2)
}

fun sum(value1: Int, value2:Int)= value1 + value2

* Contoh Lain Statement dan Expressions
fun main() {
    val angka1 = 2
    val angka2 = 3
    sum(angka1, angka2)
}

fun sum(angka1: Int, angka2: Int) = angka1 + angka2
*/
