package conditionals
/*
// IF AND ELSE
fun main() {

    val age: Int = 24

    if (age < 18) {
        println("You cannot register.")
    }
    else if (age < 21) {
        println("Well, maybe you can register.")
    }
    else if (age < 27){
        println("You should be able to register.")
    }
    else {
        println("You're good to go!")
    }

    println("The end.")
}

// USING WHEN
fun main() {

    val mode: Int = 5

    when (mode) {
        1 -> println("The mode is lazy.")

        2 -> {
            println("The mode is 2")
            println("So the mode is busy.")
        }

        3 -> println("The mode is super-productive")

        else -> println("I don't know that mode.")
    }
}

// WHEN TO USE 'IF' VS 'WHEN'
fun main() {

    val mode: Int = 5

    when (mode) {
        1 -> println("The mode is lazy.")

        2 -> {
            println("The mode is 2")
            println("So the mode is busy.")
        }

        3 -> println("The mode is super-productive")

        else -> println("I don't know that mode.")
    }

    if (true){
        // ...
    }
}

// CONDITIONALS  EXPRESSIONS
fun main() {

    val mode: Int = 2

    val result = when (mode) {
        1 -> println("The mode is lazy.")

        2 -> {
            println("The mode is 2")
            val i: Int = 3
            "So the mode is busy."
        }

        3 -> println("The mode is super-productive")
        else -> println("I don't know that mode.")
    }

    println(result)

    val x = if (mode < 2){
        println("Mode is less than 2")
        17
    }
    else { 42 }

    println(x)
}

// MORE ADVANCED 'WHEN' CONSTRUCTS
fun main() {

    val x = 10

    when(x){
        5 -> println("x is 5")
        3*12 -> println("x is 3*12")
        "Hey there".length -> println("x is the length of the string 'Hey there'")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println("x is between 12 and 20")
        in 21..30 -> println("x is between 12 and 20")
        !in 1..9 -> println("x is not between 1 and 9")
    }
}
*/