package cp6Collection

object SetExample {

    fun f0() {
        val num1 = readlnOrNull()!!.toInt()
        val numbers: MutableSet<String> = mutableSetOf()
        for (i in 0..num1 - 1) {
            numbers.add(readlnOrNull()!!)
        }
        println(numbers)
    }

    fun f1() {
        val num1 = readlnOrNull()!!.toInt()
        val numbers1: MutableSet<String> = mutableSetOf()
        for (i in 0..num1 - 1) {
            numbers1.add(readlnOrNull()!!)
        }
        val num2 = readlnOrNull()!!.toInt()
        val numbers2: MutableSet<String> = mutableSetOf()
        for (i in 0..num2 - 1) {
            numbers2.add(readlnOrNull()!!)
        }

        println((numbers1 - numbers2).size == 0)
    }

    fun f2() {
        val num1 = readlnOrNull()!!.toInt()
        val numbers1: MutableSet<String> = mutableSetOf()
        for (i in 0..num1 - 1) {
            numbers1.add(readlnOrNull()!!)
        }
        val num2 = readlnOrNull()!!.toInt()
        val numbers2: MutableSet<String> = mutableSetOf()
        for (i in 0..num2 - 1) {
            numbers2.add(readlnOrNull()!!)
        }

        println((numbers1 union numbers2))
    }

    fun f3() {
        val num1 = readlnOrNull()!!.toInt()
        val numbers1: MutableSet<String> = mutableSetOf()
        for (i in 0..num1 - 1) {
            numbers1.add(readlnOrNull()!!)
        }
        val num2 = readlnOrNull()!!.toInt()
        val numbers2: MutableSet<String> = mutableSetOf()
        for (i in 0..num2 - 1) {
            numbers2.add(readlnOrNull()!!)
        }

        println((numbers1 intersect numbers2))
    }
}