package cp7WorkWithFun

object funExe {

    fun funExe0() {
        fun greet() {
            println("Привет, мир!")
        }
    }

    fun funExe1() {
        fun copyF(num: Int, str: String) {
            for (i in 1..num) {
                println(str)
            }
        }

        var str = readlnOrNull()!!
        var num = readlnOrNull()!!.toInt()
        copyF(num, str)
    }

    fun funExe2() {
        fun plusMinusF(num: Int) {
            println(num + 1)
            println(num - 1)
        }

        var num = readlnOrNull()!!.toInt()
        plusMinusF(num)
    }

    fun funExe3() {
        fun majorityDecision(bool1: Boolean, bool2: Boolean, bool3: Boolean) {
            if (bool1 && bool2 || bool1 && bool3 || bool2 && bool3)
                println(true)
            else
                println(false)
        }

        var bool1 = readlnOrNull()!!.toBoolean()
        var bool2 = readlnOrNull()!!.toBoolean()
        var bool3 = readlnOrNull()!!.toBoolean()
        majorityDecision(bool1, bool2, bool3)
    }

    fun lambdaExpressions_AnonymousFunctions0() {
        val confusedPrinter: (Int) -> Unit = { println(it * 10) }

        val n = readln().toInt()
        confusedPrinter(n)
    }

    fun lambdaExpressions_AnonymousFunctions1() {
        val countdown: (Int) -> Unit = fun(x: Int): Unit {
            for (i in x downTo 0) {
                println(i)
            }
        }
        val num = readlnOrNull()!!.toInt()
        countdown(num)
    }

    fun lambdaExpressions_AnonymousFunctions2() {
        val spaceMaker: (String, String) -> String = fun(s1: String, s2: String): String {
            return "$s1 $s2"
        }
        val str1 = readlnOrNull()!!
        val str2 = readlnOrNull()!!
        println(spaceMaker(str1, str2))
    }
}