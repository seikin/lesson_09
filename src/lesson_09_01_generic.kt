fun main() {
    val a: Int = 10
    val b: Double = 10.1

    println(inc(a))
    println(inc(b))
}

fun inc(n: Number): Number {
    return n.toDouble() + n.toDouble()
}