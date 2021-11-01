fun main() {
    val a: Generic02<Int> = Generic02(10)
    val b: Generic02<String> = Generic02("String")

    println(a.property)
    println(b.property)

    val SimilarMapObj: SimilarMap<String, Int> = SimilarMap("sd", 132)
    println(SimilarMapObj.value)
}

class Generic02<T> {
    val property: T

    constructor(p: T) {
        property = p
    }
}

/*массивы списски и словари все эторазные варианты параметризированных классов*/
class Generic002<T>(val property: T)

class SimilarMap<T, V>(x:T , y: V) {
    val key = x
    val value = y
}
