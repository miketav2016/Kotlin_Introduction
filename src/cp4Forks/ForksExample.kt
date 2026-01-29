package cp4Forks

object ForksExample {

    fun f0() {
        val str = readlnOrNull()!!
        if (str == "+")
            println("Рады, что вам понравилось!")
        else
            println("Жаль, что вам не понравилось")
    }

    fun f1() {
        val num1 = readlnOrNull()!!.toInt()
        if (num1 > 17)
            println("Совершеннолетний")
        else if (num1 < 18 && num1 > 0)
            println("Несовершеннолетний")
        else
            println("Введено некорректное значение")
    }

    fun f2() {
        val num1 = readlnOrNull()!!.toInt()
        if (num1 > 0) println("Число положительное") else println("Число не положительное")
    }

    fun f3() {
        val num1 = readlnOrNull()!!.toInt()
        if (num1 % 2 == 0) println("Число чётное") else println("Число нечётное")
    }

    fun f4() {
        val num1 = readlnOrNull()!!.toInt()
        val num2 = readlnOrNull()!!.toInt()
        if (num1 > num2) println(num1) else println(num2)
    }

    fun f5() {
        val num1 = readlnOrNull()!!.toInt()
        if (num1 >= 0 && num1 < 13) println("ребёнок")
        else if (num1 in 13..<18) println("подросток")
        else if (num1 in 18..<65) println("взрослый")
        else if (num1 > 64) println("пожилой")
        else println("некорректный возраст")
    }

    fun f6() {
        val x = readlnOrNull()!!.toInt()
        when (x) {
            1 -> println("Понедельник")
            2 -> println("Вторник")
            3 -> println("Среда")
            4 -> println("Четверг")
            5 -> println("Пятница")
            6 -> println("Суббота")
            7 -> println("Воскресенье")
            else -> println("Неверный номер дня")
        }
    }

    fun f7() {
        val x = readlnOrNull()!!.toInt()
        when (x) {
            in 1..12 -> println("ребёнок ")
            in 13..17 -> println("подросток ")
            in 18..64 -> println("взрослый ")
            in 64..Int.MAX_VALUE -> println("пожилой")
            else -> println("некорректный возраст")
        }
    }
}