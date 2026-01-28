package oop.classAndObject
import kotlin.math.PI

class Circle {
    // свойства (поля) класса
    var radius: Double  = 0.0
    var area : Double = 0.0

    // функции (методы) класса
    fun calculateArea() {
        area =  PI*radius*radius
        println("Radius: $radius")
        println("Area: $area")
    }
}