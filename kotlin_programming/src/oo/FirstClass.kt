package oo

class Person(val name: String, var age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

    fun getYearOfBirth(): Int = 2016 - age
}

fun main(args: Array<String>) {
    val person = Person("Jack", 17)

    person.speak()
    person.greet("world")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)
}
