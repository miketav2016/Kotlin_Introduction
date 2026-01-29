package cp5Loop

object LoopDoWhile {
    fun f0() {
        var num1 = 2
        do {
            println(num1); num1--
        } while (num1 > -3)
    }

    fun f1() {
        val num = readlnOrNull()!!.toInt()
        var num1 = 1
        do {
            if (num1 % 35 == 0)
                println(num1)
            num1++
        } while (num > num1)
    }
//Fibonacci
    fun f2() {
        var num = readlnOrNull()!!.toInt()
        var numcount = 2
        var num1 = 1
        var num2 = 1
        if (num == 1)
            println(num1)
        else if (num == 2) {
            println(num1)
            println(num2)
        } else {
            println(num1)
            println(num2)
            do {
                val num3 = num1 + num2
                println(num1 + num2)
                num1 = num2
                num2 = num3
                numcount++
            } while (num > numcount)
        }
    }
}