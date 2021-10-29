fun main() {
    val a: Int = 10
    val b: Double = 2.5

    println(divided(a,4))
    println(divided(b, 15))

}
/*обобщение параметров типа только одним типом*/
fun <N: Number> divided(x: N, y: Int): Double {
    return x.toDouble() / y
}