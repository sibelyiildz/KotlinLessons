package basictypes

fun main() {
    //Küçükten büyüğe dönüşümlerse sorunsuz dönüşüm yapılır.
    val schoolNumber: Byte = 126.toByte()
    val convertedValue: Int = schoolNumber.toInt()

    println("schoolNumber : " + schoolNumber)
    println("convertedValue : " + convertedValue)

    //Büyükten küçüğe bir dönüşümde dönüştürülen eğer aralığı dışında ise yanlış değerler oluşabiliyor.
    val intNumber: Int = 11674
    val convertedByte: Byte = intNumber.toByte()
    println("convertedByte = $convertedByte")

    val tcIdentityNumber = 15860826657
    val convertedInt = tcIdentityNumber.toInt()

    println("convertedInt : " + convertedInt)

    val byte: String = "3"
    val intValue = Integer.parseInt(byte)
    println(intValue)

    val x = (1 shl 2) and 0x000FF000
    println(x)
}