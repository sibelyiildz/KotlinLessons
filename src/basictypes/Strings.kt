package basictypes

fun main() {
    //  val s =  1.0 + "abc" //çalışmaz

    val s2 = "Sibel" + "Yıldız"
    println(s2)

    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(text)

    val price = """
    ${'$'}9.99
    """
    println(price)
}