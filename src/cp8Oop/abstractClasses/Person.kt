package cp8Oop.abstractClasses

abstract class Person {
    // Общий метод без параметров для всех фигур
    abstract fun info()
}

class Student (val name: String, val age: String) : Person() {
    override fun info() {
        println("Student: $name, Age: $age")
    }
}

class Teacher(val name: String, val subject: String) : Person() {
    override fun info() {
        println("Teacher: $name, Subject: $subject")
    }
}