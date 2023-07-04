fun main() {
    //Menggunakan Range
    val listOf = listOf(1, 2, 3, null, 5,6, null, 8, 9, 10)
    for (i in 1..10) {
        if (i == 5) continue //Perulangan akan dilanjutkan, jika kondisi terpenuhi
        println(i)
    }

    /*\
    val listOf = listOf(1, 2, 3, null, 6, null, 7)
    for (i in listOf) {
        if (i == null) continue //Perulangan akan dilanjutkan, jika kondisi terpenuhi
        println(i)
    }


    //Break = dihentikan
    val listOf = listOf(1, 2, 3, null, 6, null, 7)
    for (i in listOf){
        if( i == null)break //Perulangan akan dihentikan, jika kondisi terpenuhi
        println(i)
    }*/
}