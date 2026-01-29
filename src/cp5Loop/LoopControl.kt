package cp5Loop

object LoopControl {
    fun f0() {
        val num1 = readlnOrNull()!!.toInt()
        for (i in 1..num1) {
            if (i == 4) {
                println("С меня хватит")
                break  // завершаем цикл, если i равно 5
            }
            println(i)
        }
    }

    fun f1() {
        val num1 = readlnOrNull()!!.toInt()
        val num2 = readlnOrNull()!!.toInt()  // исключаемое число
        for (i in 1..num1) {
            if (i == num2) {
                continue
            }
            println(i)
        }
    }

    fun f2() {
        val num1 = readlnOrNull()!!.toInt()
        for (i in 1..num1) {
            val res = (i * i * i) % 10
            if (res == 6 || res == 7) {
                continue
            }
            println(i)
        }
    }
}