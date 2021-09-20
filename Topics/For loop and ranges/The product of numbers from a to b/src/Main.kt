fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var result = 1L
    for (i in a until b) {
        result *= i
    }
    println(result)
}
//fun main() = println((readLine()!!.toLong() until readLine()!!.toLong()).reduce(Long::times))