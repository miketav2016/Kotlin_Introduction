package cp8Oop.abstractClasses
import kotlin.math.PI

abstract class Shape {
    // Общий метод без параметров для всех фигур
    abstract fun area()
    abstract fun draw()
}

class Circle(val r: Double = 0.0) : Shape() {
    override fun area() {
        println("Area: ${PI * r * r}")
    }
    override fun draw() {
        println("Drawing a circle")
    }
}

class Rectangle(val a: Double, val b: Double) : Shape() {
    override fun area() {
        println("Area: ${a * b}")
    }
    override fun draw() {
        println("Drawing a Rectangle")
    }
}
class Square(val a: Double = .0) : Shape() {
    override fun area() {
        println("Area: ${a * a}")
    }
    override fun draw() {
        println("Drawing a square")
    }
}
