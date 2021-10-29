fun main() {
    val a: Int = 10
    val b: Double = 10.1
    val c: String = "Строка"
    val d: List<String> = listOf("Kotlin", "Android")

    println(toList(a, 5))
    println(toList(b, 6))
    println(toList(c, 2))
    println(toList(d, 7))

}
/*работает с разными типами данных как на прием так и на возврат*/

/* <T> параметризация обобщенная. Любая буква*/
//fun<T> toList(obj: T): List<T> {
//    val list: List<T> = listOf(obj, obj)
//    return list
//}

fun <T> toList(obj: T, count: Int): List<T> {
    val mlist = mutableListOf<T>()
    for (i in 1..count) {
        mlist.add(obj)
    }
    return mlist
}




