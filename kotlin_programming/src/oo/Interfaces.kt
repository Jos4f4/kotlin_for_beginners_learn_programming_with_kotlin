package oo

interface Driveable { fun drive() }

interface Buidable {

    val timeRequired: Int
    fun buid()
}

class Car(val color: String): Driveable, Buidable {

    override val timeRequired: Int = 120

    override fun drive() { println("Driving car...") }

    override fun buid() { println("Built a shiny car...") }
}

class MotorCycle(val color: String): Driveable {

    override fun drive() { println("Driving motorcycle...") }
}

fun main(args: Array<String>) {

    val car: Driveable = Car("blue")
    car.drive()

    val motorCycle: Driveable = MotorCycle( "red")
    motorCycle.drive()
}