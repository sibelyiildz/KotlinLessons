package basictypes.problems

fun main() {

    //'Benim ismim blabla' gibi bir çıktı görmek istiyorum. Düzeltikdikten sonra da exception gelebilir dikkat :)
    val names = arrayOf("Ali", "Ayşe", "Veli", "Mehmet")
    for (i in 0..names.size) {
        println("Benim ismim $names[i]")
    }
}