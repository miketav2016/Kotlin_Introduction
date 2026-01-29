package cp8Oop.inheritance

open class Person(val name: String, val role: String)   {
    open fun showInfo() {
        println("Имя: $name")
        println("Роль: $role ")
    }
}

class Moderator(name: String, role: String) : Person(name,role) {
    override fun showInfo() {
        println("Имя: $name")
        println("Роль: Модератор ")
    }
}
class Admin(name: String, role: String) : Person(name,role) {
    override fun showInfo() {
        println("Имя: $name")
        println("Роль: Администратор ")
    }
}