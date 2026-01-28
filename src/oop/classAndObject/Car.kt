package oop.classAndObject

class Car {
    // свойства (поля) класса
    var brand : String  = ""
    var year  : Int = 0

    constructor(brand: String, year: Int) {
        this.brand = brand
        this.year = year
    }
}