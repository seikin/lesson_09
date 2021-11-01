/*лямда функция - это функция, ктор записывается в виде вырадения
и которую можно передавать в виде переменной в другие функции*/

/*также изветсны как анонимные функции*/

fun main() { //простейшее лябда выражение
//    run { println("Some txt") }

//    { println("Some txt") } () //простейший вариант с указанием ()


//    {text: String -> println(text) } ("some arg") //для того, чтобы функция получила имя, надо в начале указать имя принимаемого параметра

   val lambda =  {text: String ->
       println(text)
   } ("some arg")

    val lambda01 = { x: Int, y: Int ->
        x + y
    } (10,2)
    println(lambda01)

    val lambdafx = {x: Int, y: Int -> x + y}
    val a = lambdafx(15,5)
    val b = lambdafx(74,155)
    println("a = $a, b = $b")

    val lambdafxtype: (Int, Int) -> Int = {x,y -> x+y} // такой вариант указания типов принимаемых значений удобен при разработке в команде
    val c = lambdafxtype(18,35)
    val d = lambdafxtype(34,35)
    println("c = $c, d = $d")

    val lmbdOnePar: (Any) -> Unit = { println(it) } // для разных типов параметров, в завистисоти от того, каой тип пришел
    lmbdOnePar(10)
    lmbdOnePar("String...")
    lmbdOnePar(10.2)
    lmbdOnePar(listOf("klk", 10, "string"))
}
