package oo

abstract class Course(val topic: String, val price: Double) {
    open fun learn() { println("Learning a great $topic course") }
}

interface Learnable {
    fun learn() { println("Learning...") }
}

open class kotlinCourse(): Course("Kotlin", 999.99), Learnable {
    override final fun learn() {
        super<Course>.learn()
        println("I'm one of the first people to learn kotlin!")
    }
}

fun main() {
    val course = kotlinCourse()
    course.learn()
}
