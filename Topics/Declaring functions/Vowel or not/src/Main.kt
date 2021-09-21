fun isVowel(letter: Char): Boolean = letter.lowercaseChar() in "aeiou"

fun main() {
    val letter = readLine()!!.first()
    println(isVowel(letter))
}