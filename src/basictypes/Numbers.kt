package basictypes

fun main() {
    val byteMax: Byte = Byte.MAX_VALUE
    println("Byte max = $byteMax")

    val intMax: Int = Int.MAX_VALUE
    println("intMax = $intMax")

    val longNumber: Long = 128
    val longNumber2: Long = 128L
    println("longNumber = $longNumber, longNumber2= $longNumber2")

    val floatNumber: Float = 128.0F
    println("floatNumber = $floatNumber")

    val doubleNumber: Double = 128.0
    println("doubleNumber = $doubleNumber")

    //--------------------------------------------------

    //Referance aquality
    val a: Int = 100
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 10000
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false

    val name: String = "Sibel"
    val boxedName: Int = a
    val anotherboxedName: Int = a
    println(boxedName === anotherboxedName) //true


}