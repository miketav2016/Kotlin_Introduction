package oop.interfaces

interface Vehicle  {
    fun drive()
}
class Car : Vehicle {
    override fun drive() {
        println("Автомобиль едет")
    }
}