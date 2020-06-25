fun main() {
    val sum = { x: Int, y: Int -> x + y }
    val diff = { x: Int, y: Int -> x - y }
    val mult = { x: Int, y: Int -> x * y}
    val div = { x: Double, y: Double -> x / y}
    // val div: (Int, Int) -> Double = { x: Int, y: Int -> (x / y).toDouble()}

    val addOne = {i: Int -> i + 1}

    // val diff : (x: Int, y: Int) -> (x - y)

    println("sum: ${sum(1, 2)}")
    println("diff: ${diff(1, 2)}")
    println("mult: ${mult(1, 2)}")
    println("div: ${div(1.0, 2.0)}")

    var collection: Collection<Int> = (1..10).toList()

    collection.forEach {
        if (it%2 == 0) {
            println("it: ${it}")
        }
    }

    collection.any()
}