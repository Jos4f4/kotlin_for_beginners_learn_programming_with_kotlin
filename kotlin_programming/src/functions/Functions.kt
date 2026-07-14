package functions

import java.util.Date

// No parameters, no return value
fun helloWorld() {
    println("Hello World!")
}

// "Kotlin" -> "K o t l i n"
// 1 parameter, no return value
fun printWithSpaces(text: String) {
    for (char in text) { print(char + " ") }
    println()
}

// No parameters, return Date
fun getCurrentDate(): Date {
    return Date()
}

// 2 parameters, return Int
fun max(a: Int, b: Int): Int {
    if (a >=  b) { return a } else { return b }
}

fun main() {
    helloWorld()
    printWithSpaces("Kotlin is awesome!")
    println(getCurrentDate())
    println(max(17, 42))
}