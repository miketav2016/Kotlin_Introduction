package cp8Oop.classAndObject
/*
3
Alice 20
Bob 22
Charlie 19
 */
class Student {
    // свойства (поля) класса
    var name: String  = ""
    var age : Int = 0

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}