package oop

import oop.classAndObject.Car
import oop.classAndObject.Circle
import oop.classAndObject.Logger
import oop.classAndObject.Student
import oop.classAndObject.Triangle

object OOPFun {

    fun classAndObject0() {
        var numCircle = readlnOrNull()!!.toDouble()
        val myCircle = Circle()
        myCircle.radius = numCircle
        myCircle.calculateArea()
    }

    fun classAndObject1() {
        val numStudent = readlnOrNull()?.toIntOrNull() ?: 0
        val students: MutableSet<Student> = mutableSetOf()

        for (i in 1..numStudent) {
            val line = readlnOrNull() ?: "" // Считываем всю строку "Bob 22"
            val parts = line.split(" ")    // Режем её по пробелу

            if (parts.size >= 2) {
                val name = parts[0]
                val age = parts[1].toIntOrNull() ?: 0
                students.add(Student(name, age))
            }
        }
        for (item in students) {
            println("Name: ${item.name}, Age: ${item.age}")
        }
    }

    fun classAndObject2() {
        val numLog = readlnOrNull()?.toIntOrNull() ?: 0
        val myLogs: MutableSet<String> = mutableSetOf()

        for (i in 1..numLog) {
            val line = readlnOrNull() ?: ""
            myLogs.add(line)
        }

        for (item in myLogs) {
            Logger().log(item)
        }
    }

    fun classAndObject3() {
        val numTriangle = readlnOrNull()?.toIntOrNull() ?: 0
        val myTriangles: MutableSet<Triangle> = mutableSetOf()

        for (i in 1..numTriangle) {
            val line = readlnOrNull() ?: ""
            val parts = line.split(" ")

            if (parts.size >= 2) {
                val side1 = parts[0].toDoubleOrNull() ?: 0.0
                val side2 = parts[1].toDoubleOrNull() ?: 0.0
                val side3 = parts[2].toDoubleOrNull() ?: 0.0
                myTriangles.add(Triangle(side1, side2, side3))
            }
        }

        for (item in myTriangles) {
            println(item.isEquilateral())
        }
    }

    fun classAndObject4() {
        /*
        3
        BMW 2018
        Audi 2020
        Mercedes 2019
         */
        val num = readlnOrNull()?.toIntOrNull() ?: 0
        val cars: MutableSet<Car> = mutableSetOf()

        for (i in 1..num) {
            val line = readlnOrNull() ?: "" // Считываем всю строку "Bob 22"
            val parts = line.split(" ")    // Режем её по пробелу

            if (parts.size >= 2) {
                val brand = parts[0]
                val year = parts[1].toIntOrNull() ?: 0
                cars.add(Car(brand, year))
            }
        }

        for (item in cars) {
            println("Brand: ${item.brand}, Year: ${item.year}")
        }
    }

    fun inheritance0() {
        var str1 = readlnOrNull()!!
        if (str1 == "Dog") oop.inheritance.Dog().sound()
        else if (str1 == "Cat") oop.inheritance.Cat().sound()
        else if (str1 == "Bird") oop.inheritance.Bird().sound()
    }

    fun inheritance1() {
        when (readln()) {
            "Circle" -> oop.inheritance.Circle().draw()
            "Square" -> oop.inheritance.Square().draw()
            "Triangle" -> oop.inheritance.Triangle().draw()
        }
    }

    fun inheritance2() {
        when (readln()) {
            "Car" -> oop.inheritance.Car().drive()
            "Bicycle" -> oop.inheritance.Bicycle().drive()
            "Boat" -> oop.inheritance.Boat().drive()
        }
    }

    fun inheritance3() {
        val line = readlnOrNull() ?: ""
        val parts = line.split(" ")

        if (parts.size >= 2) {
            val name = parts[0]
            val role = parts[1]
            when (role) {
                "Person" -> oop.inheritance.Person(name, role).showInfo()
                "Moderator" -> oop.inheritance.Moderator(name, role).showInfo()
                "Admin" -> oop.inheritance.Admin(name, role).showInfo()
            }
        }
    }

    fun accessModifiers0() {
        /*
        3
        Charlie
        David
        Eva
         */
        val num = readlnOrNull()?.toIntOrNull() ?: 0
        val persons: MutableSet<oop.accessModifiers.Person> = mutableSetOf()

        for (i in 1..num) {
            val name = readlnOrNull() ?: ""
            persons.add(oop.accessModifiers.Person().sName(name))
        }
        for (item in persons) {
            item.printName()
        }
    }

    fun accessModifiers1() {
        val num = readlnOrNull()?.toIntOrNull() ?: 0
        val students: MutableSet<oop.accessModifiers.Student> = mutableSetOf()


        repeat(num) {
            val line = readlnOrNull() ?: ""
            val parts = line.split(" ")
            if (parts.size >= 2) {
                val name = parts[0]
                val studentId = parts[1].toIntOrNull() ?: 0
                val student = oop.accessModifiers.Student()
                student.sName(name)
                student.studentId(studentId)
                students.add(student)
            }
        }
        for (item in students) {
            item.printStudentDetails()
        }
    }

    fun accessModifiers2() {
        val num = readlnOrNull()?.toIntOrNull() ?: 0
        val teachers: MutableSet<oop.accessModifiers.Teacher> = mutableSetOf()
        repeat(num) {
            val line = readlnOrNull() ?: ""
            val teacher = oop.accessModifiers.Teacher()
            teacher.sSubject(line)
            teachers.add(teacher)
        }
        for (item in teachers) {
            item.printSubject()
        }
    }

    fun polymorphism0() {
        val typeOp = readlnOrNull() ?: ""
        val x1 = readlnOrNull() ?: ""
        val x2 = readlnOrNull() ?: ""
        val res = when (typeOp) {
            "multiply" -> oop.polymorphism.Calculator.calculate(x1.toDouble(), x2.toDouble())
            "add" -> oop.polymorphism.Calculator.calculate(x1.toInt(), x2.toInt())
            "concatenate" -> oop.polymorphism.Calculator.calculate(x1, x2)
            else -> "Unknown operation"
        }
        println(res)
    }

    fun polymorphism1() {
        val typeNum = readlnOrNull() ?: ""
        val typeOp = readlnOrNull() ?: ""

        var x1 = readlnOrNull() ?: ""
        var x2 = readlnOrNull() ?: ""

        val res = when (typeOp.trim() to typeNum.trim()) {
            ("add" to "Int") -> oop.polymorphism.Calculator.add(x1.toInt(), x2.toInt())
            ("add" to "Double") -> oop.polymorphism.Calculator.add(x1.toDouble(), x2.toDouble())
            ("subtract" to "Int") -> oop.polymorphism.Calculator.subtract(x1.toInt(), x2.toInt())
            ("subtract" to "Double") -> oop.polymorphism.Calculator.subtract(x1.toDouble(), x2.toDouble())
            ("multiply" to "Int") -> oop.polymorphism.Calculator.multiply(x1.toInt(), x2.toInt())
            ("multiply" to "Double") -> oop.polymorphism.Calculator.multiply(x1.toDouble(), x2.toDouble())
            ("divide" to "Int") -> oop.polymorphism.Calculator.divide(x1.toInt(), x2.toInt())
            ("divide" to "Double") -> oop.polymorphism.Calculator.divide(x1.toDouble(), x2.toDouble())
            else -> "Unknown operation"
        }
        println(res)
    }

    fun interfaces0() {
        val str = readlnOrNull() ?: ""
        if (str == "drive")
            oop.interfaces.Car().drive()
    }

    fun interfaces1() {
        val str = readlnOrNull() ?: ""
        if (str == "play")
            oop.interfaces.Guitar().play()
    }

    fun abstractClasses0() {
        val str = readlnOrNull() ?: ""
        if (str == "circle") {
            val r = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            oop.abstractClasses.Circle(r).area() // Передаем данные в конструктор
        } else if (str == "rectangle") {
            val a = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            val b = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            oop.abstractClasses.Rectangle(a, b).area()
        }
    }

    fun abstractClasses1() {
        val str = readlnOrNull() ?: ""
        if (str == "circle") {
            oop.abstractClasses.Circle().draw()
        } else if (str == "square") {
            oop.abstractClasses.Square().draw()
        }
    }
}