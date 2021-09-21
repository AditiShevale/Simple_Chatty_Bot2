fun main() {

    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val d = readLine()!!.toInt()
    var sum = 1
    for (i in a..d) {
        sum =  a * i * i * i + b * i * i + c * i + d
        if (i ==0){
        print(sum)
    }}
}