package basictypes

fun main() {
    print("Öğrenci misin?")
    val answer = readLine()

    // expression kullanimi. {} icerisindeki son satir, deger olarak degiskene atanir.
    val result: String = if (answer == "Evet") {
        "Öğrenci"
    } else {
        "Öğrenci Değil"
    }
    println(result)

    // --------------------------------------------

    val season = 3
    when (season) {
        1, 2 -> print("Hot")
        3, 4 -> print("Cold")
        else -> "Invalid Seasons"
    }

    //Bu kullanımda && || gibi ifadeler kullanılabilir, yukarda kullanılamaz
    val season2 = 3
    when {
        season2 == 1 || season2 == 2 -> print("Hot")
        season2 == 3 || season2 == 4 -> print("Hot")
    }

    //Range liste oluşturmaya yarar
    val numbers = 1..100
    numbers.forEach {
        println("numbers -> $it")
    }

    val alfabe = 'A'.rangeTo('Z')
    alfabe.forEach {
        println("alfabe -> $it")
    }

}