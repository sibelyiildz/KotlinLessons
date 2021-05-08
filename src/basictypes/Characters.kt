package basictypes

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val charNumber: Char = '6'
    val contertedCharNumber = charNumber.digitToInt()
    println("charNumber = " + charNumber)
    println("contertedCharNumber = " + contertedCharNumber)

    val totalValue = charNumber.toInt() * contertedCharNumber
    println("totalValue = " + totalValue)

    val charValue: Char = 'A'
    println(charValue.digitToInt(16))

    val charValue2: Char = 'G'
    //println(charValue.digitToInt(100)) //Failed - olmayan bir sayı tabanı

    val charValue3: Char = '9'
    //println(charValue.digitToInt(8)) // Failed - verilen sayı tabanının dışında bir değer
}