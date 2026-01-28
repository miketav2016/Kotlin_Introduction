package loop

object LoopFor {
    fun f0() {
        val num = readlnOrNull()!!.toInt()
        for (i in 2 until num) {
            println(i * 2)
        }
    }

    fun f1() {
        for (i in 1..5) {
            println(i)
        }
    }

    fun f2() {
        val num1 = readlnOrNull()!!.toInt()
        val num2 = readlnOrNull()!!.toInt()
        var sum = 0
        for (i in num2..num1 step 3) {
            sum += i
        }
        println(sum)
    }
}