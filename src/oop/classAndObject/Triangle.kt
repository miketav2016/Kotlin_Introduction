package oop.classAndObject
/*
3
3.0 3.0 3.0
5.0 5.0 8.0
2.0 2.0 2.0
 */
class Triangle {
    // свойства (поля) класса
    var side1: Double  = 0.0
    var side2: Double  = 0.0
    var side3: Double  = 0.0

    constructor(side1: Double, side2: Double, side3: Double) {
        this.side1 = side1
        this.side2 = side2
        this.side3 = side3
    }
    fun isEquilateral(): String {
        return if(side1== side2 && side1 == side3) "Equilateral" else "Not Equilateral"
    }
}