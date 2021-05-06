package basictypes.problems

fun main() {
    //Sadece atadığım yeni listenin değerleri güncellensin.
    val list = arrayListOf("A", "B", "C", "D", "E")
    val newList = list


    for (item in newList.indices) {
        newList[item] = "S"
    }
    println(list)
    println(newList)


}