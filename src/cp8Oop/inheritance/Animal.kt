package cp8Oop.inheritance

// Родительский класс (суперкласс)
open class Animal {
    open fun sound() {
        println("Животное издает звук")
    }
}

// Дочерний класс (подкласс)
class Dog : Animal() {
    override fun sound() {
        println("Гав")
    }
}
class Cat
    : Animal() {
    override fun sound() {
        println("Мяу")
    }
}
class Bird : Animal() {
    override fun sound() {
        println("Чирик")
    }
}