package cp8Oop.accessModifiers

open class Person {
    protected var name: String = ""
    fun sName(newName: String): Person {
        this.name = newName
        return this
    }

    fun printName() {
        println("Name: $name")
    }
}

open class Student : Person() {
    protected var studentId: Int = 0
    fun studentId(newId: Int) {
        this.studentId = newId
    }

    fun printStudentDetails() {
        println("Name: $name, Student ID: $studentId")
    }

}