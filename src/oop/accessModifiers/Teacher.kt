package oop.accessModifiers

open class Teacher  {
    internal var subject: String = ""
    fun sSubject(newSubject: String)  {
        this.subject = newSubject
    }
    fun printSubject() {
        println("Subject: $subject")
    }
}