fun main(){ //Inisialiasasi
    val RED = Color.RED
    val GREEN = Color.GREEN
    val BLUE = Color.BLUE
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/*\
Anonymous Kelas
fun main(){
    val RED = Color.RED.printValue()
    print(RED)
}

enum class Color(val value: Int){
    RED(0xFF0000){
        override fun printValue(){
            println("Color RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue(){
            println("Color GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue(){
            println("Color BLUE is $value")
        }
    };

    abstract fun printValue()
}

*Mendapatkan daftar objek dan nama objek dari enum class
fun main(){
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        println(color)
    }
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

*Mendapatkan Value Dari Objeknya
fun main(){
    val colors= Color.valueOf("RED")
    println(color)
    }

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

*Mengecek Instance dari Objek pada Enum Class
fun main(){
    when(Color.BLUE){
    Color.RED -> println("Color is RED")
    Color.GREEN -> println("Color is GREEN")
    Color.BLUE -> println("Color is BLUE")
    }
}

enum class Color(val value: Int){
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}
*/