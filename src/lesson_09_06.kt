fun main() {
    val year = readLine()!!.toInt()



    if (year in 1980..2020) {
        println("Normal: $year")
        } else {
            println("Not normal")
        }
}