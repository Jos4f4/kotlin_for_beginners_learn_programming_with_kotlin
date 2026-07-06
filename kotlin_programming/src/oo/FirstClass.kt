package oo

class Person {
    var name: String = "Sarah"
    var age: Int = 42

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

//    fun getYearOfBirth(): Int {
//        return 2016 - age
//    }

    fun getYearOfBirth(): Int = 2016 - age
}

fun main(args: Array<String>) {
    val person = Person()

    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)
}