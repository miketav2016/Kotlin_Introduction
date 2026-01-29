package cp5Loop

object LoopWhile {
    fun f0() {
        var num1 = readlnOrNull()!!.toInt()
        var num2 = 1
        while (num1 > 0) {
            println(num2)
            num2++
            num1--
        }
    }

    fun f1() {
        var i = 0
        while (i < 10) {
            if (i % 2 == 0) println(i)
            i++
        }
    }

    fun f2() {
        var i = 1
        while (i < 6) {
            println(i * i)
            i++
        }
    }
}