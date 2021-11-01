// лямбда fx обычно связаны с функциями высшегопорядка

fun main() {
    val intList: List<Int> = listOf(1, 6, 4)

    val multi: (Int) -> Int = { it * 2 } //вариант записи
    val sum: (Int) -> Int = { n: Int -> n + 2 } //вариант записи

    val multlist = mathList(intList, multi)
    val sumlist = mathList(intList, sum)

    println(multlist)
    println(sumlist)

}

fun mathList(list: List<Int>, math: (Int) -> Int): List<Int> {
    val newList = mutableListOf<Int>()

    for (i in list) {
        newList.add(math(i))
    }
    return newList
}

