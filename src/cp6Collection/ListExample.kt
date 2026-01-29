package cp6Collection

object ListExample {

    fun f0() {
        val num1 = readlnOrNull()!!.toInt()
        val numbers: MutableList<Int> = mutableListOf()
        for (i in 0..num1 - 1) {
            val num = readlnOrNull()!!.toInt()
            numbers.add(num * num)
        }
        println(numbers.sum())
    }

    fun f1() {
        val num1 = readlnOrNull()!!.toInt()
        val numbers: MutableList<String> = mutableListOf()
        for (i in 0..num1 - 1) {
            numbers.add(readlnOrNull()!!)
        }
        for (i in num1 - 1 downTo 0) {
            println(numbers[i])
        }
    }

    fun f2() {
        val num1 = readlnOrNull()!!.toInt()
        val numbers: MutableList<String> = mutableListOf()
        for (i in 0..num1 - 1) {
            numbers.add(readlnOrNull()!!)
        }
        println(numbers.distinct().size == 1)
    }

}