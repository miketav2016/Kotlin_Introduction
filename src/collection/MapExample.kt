package collection

object MapExample {
    fun f0() {
        val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
        mutableMap.put("four", 4)
        println(mutableMap)
    }

    fun f1() {
        val map: Map<String, Int> = mapOf(
            "Понедельник" to 1,
            "Вторник" to 2,
            "Среда" to 3,
            "Четверг" to 4,
            "Пятница" to 5,
            "Суббота" to 6,
            "Воскресенье" to 7
        )
        println(map)
    }

    fun f2() {
        val strNumb = readlnOrNull()!!
        val arrayStr = strNumb.split(",")
        val mutableMap: MutableMap<String, Int> = mutableMapOf()
        for (str in arrayStr) {
            val modStr = str.trim()
            val value = mutableMap[modStr]
            if (value == null)
                mutableMap.put(modStr, 1)
            else
                mutableMap.put(modStr, value + 1)
        }

        println(mutableMap)
    }
}