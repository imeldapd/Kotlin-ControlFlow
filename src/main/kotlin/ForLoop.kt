fun main() {
    //Mencetak perulangan dengan foreach dengan index
    val range = 1..(5) step 2
    range.forEachIndexed(){index, value ->
        println("value is $value with index $index")
    }

    /*\
    //Mencetak perulangan dengan foreach
    val range = 1..(5) step 2
    range.forEach { value ->
        println("value is $value")
    }


    //Mencetak Value dengan index
    val range = 1..(5) step 2
    for ((index, value) in range.withIndex()){
        println("value is $value with $index")
    }


    val range = 1..(5) step 2
    for ( i in range){
        println("value is $i")
    }


    val range = 1..(5)
    for (i in range){
        println("value is $i")
    }*/
}