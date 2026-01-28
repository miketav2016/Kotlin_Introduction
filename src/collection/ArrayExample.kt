package collection

object ArrayExample {

    fun f0() {
        val num1 = readlnOrNull()!!.toInt()
        val intArray = IntArray(num1)
        for (i in 0..num1 - 1) {
            intArray[i] = readlnOrNull()!!.toInt()
        }
        var sum = 0
        for (i in 0..num1 - 1) {
            sum += intArray[i]
        }
        println(sum)
    }

    fun f1() {
        val num1 = readlnOrNull()!!.toInt()
        val intArray = IntArray(num1)
        for (i in 0..num1 - 1) {
            intArray[i] = readlnOrNull()!!.toInt()
        }

        println(intArray.max())
    }

    fun f2() {
        val x = readlnOrNull()!!.toInt()
        val num1 = readlnOrNull()!!.toInt()
        val intArray = IntArray(num1)
        for (i in 0..num1 - 1) {
            intArray[i] = readlnOrNull()!!.toInt()
        }

        println(intArray.contains(x))
    }

    fun f3() {
        val num1 = readlnOrNull()!!.toInt()
        var res = 0
        val intArray = IntArray(num1)
        for (i in 0..num1 - 1) {
            val num = readlnOrNull()!!.toInt()
            intArray[i] = num
            if (num % 2 == 0) res++
        }
        println(res)
    }

    fun f4() {
        val num1 = readlnOrNull()!!.toInt()
        val intArray = IntArray(num1)
        for (i in 0..num1 - 1) {
            intArray[i] = readlnOrNull()!!.toInt()
        }
        for (i in num1 - 1 downTo 0) {
            println(intArray[i])
        }
    }


}