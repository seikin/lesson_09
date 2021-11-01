fun main() {
    val a: Generic<Int> = Generic(10)
    val b: Generic<String> = Generic("String")

    println(a.property)
    println(b.property)
}

class Generic<T> {
    val property: T

    constructor(p: T) {
        property = p
    }
}

/*массивы списски и словари все эторазные варианты параметризированных классов*/
class Generic2<T>(val property: T)
