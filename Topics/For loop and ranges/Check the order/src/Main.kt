fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        val number = readLine()!!.toInt()
        list.add(number)
    }
    if (list == list.sorted()) {
        println("YES")
    } else {
        println("NO")
    }

}