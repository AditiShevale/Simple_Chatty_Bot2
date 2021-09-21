fun main() {

    val input = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    for (i in 1..input) {
        val a = readLine()!!.toInt()
        list.add(a)
    }
    list.sort()
    if (list.size > 1) {
        println(list[list.lastIndex] * list[list.lastIndex - 1])
    } else {
        println(list.joinToString())
    }
}