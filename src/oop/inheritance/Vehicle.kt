package oop.inheritance

open class Vehicle  {
    open fun drive() {
        println("Едем на Vehicle ")
    }
}

class Car : Vehicle () {
    override fun drive() {
        println("Едем на машине")
    }
}
class Bicycle : Vehicle () {
    override fun drive() {
        println("Едем на велосипеде")
    }
}
class Boat : Vehicle () {
    override fun drive() {
        println("Плывем на лодке")
    }
}
