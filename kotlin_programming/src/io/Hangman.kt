package io

import java.util.Locale
import java.util.Locale.getDefault

fun main(args: Array<String>) {
    print("Enter the word to guess: ")
    val word = readLine()

    if (word == null) {
        println("No word given, game ended.")
        return
    }

    for (i in 1..100) { println() }

    // Tree
    // tree
    // ['t', 'r', 'e', 'e']
    // {'t', 'r', 'e', 'e'}
    val letters = word.lowercase(getDefault()).toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while (letters != correctGuesses) {
        printExploredWord(word, correctGuesses)
        println("#Wrong guesses: $fails\n")

        print("Guess letter: ")
        val input = readLine()

        if (input == null) {
            continue
        }
        else if (input.length != 1) {
            println("Please enter one letter")
            continue
        }

        if (word.lowercase(getDefault()).contains(input.lowercase(getDefault()))) {
            correctGuesses.add(input[0].lowercase(getDefault()))
        }
        else {
            ++fails
        }
    }

    printExploredWord(word, correctGuesses)
    println("\n#Wrong guesses: $fails\n\n")
    println("Well done")
}

private fun MutableSet<Char>.add(element: String) {}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for (character in word.lowercase(getDefault())) {
        if (correctGuesses.contains(character)) {
            print(character + " ")
        }
        else {
            print("_ ")
        }
    }
}
