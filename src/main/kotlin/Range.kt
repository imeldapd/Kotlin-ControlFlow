fun main() {
    //Menggunakan Char
    val range = 'A'.rangeTo('J')
    range.forEach {
        print("$it ")
    }
}
/*\
    val range = 10.downTo(1) step 3
    range.forEach {
        print("$it ")
    }


    //Mengubah Step Dari Range
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }


        val rangeInt = 1.rangeTo(10) step 2
        rangeInt.forEach {
            print("$it ")
    }


    //Dengan Penulisan Range menggunakan ..
    val rangeInt = 1..10
    rangeInt.forEach {
    print("$it ") //it merupakan lambda function
    }

    //Dengan Penulisan Range menggunakan rangeTo(10)
    val rangeInt = 1.rangeTo(10)
    rangeInt.forEach {
    print("$it ")
    }
}
*/

