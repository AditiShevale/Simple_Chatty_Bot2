fun main() {

    val range0 = readLine()!!.toInt()..readLine()!!.toInt()
    val range1 = readLine()!!.toInt()..readLine()!!.toInt()
    val num = readLine()!!.toInt()
    println(num in range0 || num in range1)


}