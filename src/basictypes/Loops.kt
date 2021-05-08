package basictypes

fun main() {
    var numbers = arrayOf(5, 10, 15, 20)
    for (index in numbers) {
        println(index)
    }

    for ((index, value) in numbers.withIndex()) {
        print("index: $index , value: $value  || ")
    }

    println("\n------------------------------")

    for (value in 1..10) {
        if (value % 2 == 1) {
            continue
        }
        println(value)
    }

    println("\n------------------------------")

    // while kullanımına örnek
    var number = 1
    while (number < 10) {
        println(number)
        number++
    }

    println("\n------------------------------")
// Aynı örenek üzerinden do while kullanımı
    var number2 = 1
    do {
        println(number2)
    } while (number2 < 1)

    println("\n------------------------------")
    // is !is ile bir class'in referansi olunup olunmadigi kontrolu yapilabilir.
    val phoneNumber: Long = 5316266922
    when (phoneNumber) {
        is Long -> {
            println("Long value")
        }
        !is Long -> {
            println("Long value")
        }
    }


}