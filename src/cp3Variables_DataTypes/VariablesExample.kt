package cp3Variables_DataTypes

object VariablesExample {
    fun f0() {
        val message = "Kotlin"
        print(message)
    }

    fun f1() {
        val PI = 3.14
        val m = 52
        print(PI + m)
    }

    fun f2() {
        var batteryLevel = 75
        batteryLevel = 100
        println(batteryLevel)
    }

    fun f3() {
        val enteredString = readlnOrNull()
        println(enteredString)
    }

    fun f4() {
        val enteredString = readlnOrNull()
        val enteredInt = enteredString!!.toInt()
        println(enteredInt + 3)
        println(enteredInt - 3)
        println(enteredInt / 3)
        println(enteredInt * 3)
    }

    fun f5() {
        val num1 = readln().toInt()
        val num2 = readln().toInt()
        println(num1 + num2)
        println(num1 * num2)
    }

    fun f6() {
        val text = "42"
        val number: Long = text.toLong()
        println(number)
    }

    fun f7() {
        val enteredString = readlnOrNull()
        val enteredLong = enteredString!!.toLong()
        val enteredInt = enteredLong.toInt()
        println(enteredInt * 2)
    }

    fun f8() {
        val num1 = readlnOrNull()!!.toDouble()
        val num2 = readlnOrNull()!!.toDouble()
        println(num1 * num2)
    }

    fun f9() {
        val num1 = readlnOrNull()!!.toDouble()
        val num2 = readlnOrNull()!!.toDouble()
        println(num1 > num2)
    }

    fun f10() {
        val num1 = readlnOrNull()!!.toDouble()
        val num2 = readlnOrNull()!!.toDouble()
        val num3 = readlnOrNull()!!.toDouble()
        println((num1 + num2 + num3) / 3)
    }

    fun f11() {
        val num1 = readlnOrNull()!!.toInt()
        println(num1 == 1)
    }

    fun f12() {
        val isCorrect = true
        println(isCorrect.toString())
    }

    fun f13() {
        val a: Boolean = true
        val b: Boolean = false
        val result = a || b
        println(result)
    }

    fun f14() {
        val num1 = readlnOrNull()!!.toBoolean()
        println((!num1).toString())
    }

    fun f15() {
        val firstSymbol = readlnOrNull()!![0]
        println(firstSymbol.isLetter())
    }

    fun f16() {
        val firstSymbol = readlnOrNull()!![0]
        val secondSymbol = readlnOrNull()!![0]
        println(firstSymbol.code - secondSymbol.code)
    }

    fun f17() {
        val firstSymbol = readlnOrNull()!![0].uppercaseChar().code
        println(firstSymbol)
    }

    fun f18() {
        val enteredString = readlnOrNull()!!
        println(enteredString.length)
    }

    fun f19() {
        val str1 = readlnOrNull()!!
        val str2 = readlnOrNull()
        val str3 = readlnOrNull()
        println(str1 + str3 + str2)
    }

    fun f20() {
        val str1 = readlnOrNull()!!
        println(str1.last() + " " + str1.first())
    }

    fun f21() {
        val str1 = readlnOrNull()!!
        val res = str1.substring(2) + str1.substring(0, 2)
        println(res)
    }

    fun f22() {
        val str1 = readlnOrNull()!!
        val res = str1.substring(0, 1) + str1.substring(str1.length - 1, str1.length)
        println(res)
    }

    fun f23() {
        var result = readLine()
        if (result == "null") {
            result = null
        }
        result?.let { println(result) }
    }

    fun f24() {
        var result = readLine()
        if (result == "null") {
            result = null
        }
        result?.let { println(result.length) }
    }

    fun f25() {
        val nullableStr: String? = "Какой же длины это строка? Может вообще null?"
        val length = nullableStr?.let { nullableStr.length }
        println(length)
    }

    fun f26() {
        val num1 = readlnOrNull()!!.toInt()
        val str1 = (num1 + 1).toString()
        println("Ваше число: ${str1}")
    }

}