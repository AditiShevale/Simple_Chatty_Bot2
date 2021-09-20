fun main() {
    val list = mutableListOf<Int>()

    while (true) {

        if (list.size <= 3) {
            list.add(readLine()!!.toInt())

        } else {
            break
        }
    }
    val num = readLine()!!.toInt()
    if (num in list[0]..list[1] && num in list[2]..list[3]) {
        println(true)
    } else {
        println(false)
    }

}

//fun main() {
//    // write your code here
//    val range0 = readLine()!!.toInt()..readLine()!!.toInt()
//    val range1 = readLine()!!.toInt()..readLine()!!.toInt()
//    val num = readLine()!!.toInt()
//    println(num in range0 && num in range1)
//}