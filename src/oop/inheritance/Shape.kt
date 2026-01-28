package oop.inheritance

open class Shape {
    open fun draw() {
        println("Рисуем фигуру")
    }
}

class Circle : Shape() {
    override fun draw() {
        println("Рисуем круг")
    }
}

class Square : Shape() {
    override fun draw() {
        println("Рисуем квадрат")
    }
}

class Triangle : Shape() {
    override fun draw() {
        println("Рисуем треугольник")
    }
}