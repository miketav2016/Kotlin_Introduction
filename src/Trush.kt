object Trush {
    init {
        val nameKotlin = "Kotlin"
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        println("Hello World!")
        println("Hello, " + nameKotlin + "!")
        // input/output
        fun defInputSome() {
            println("Input something: ")
            val enteredString = readlnOrNull()
            val num1 = readlnOrNull()!!.toInt()
            val num2 = readlnOrNull()!!.toInt()
            println(num1 + num2)
            println(num1 * num2)
        }
        //math
        val a = 51
        val b = 3
        val sum = a + b  // Сложение: 5 + 3 = 8
        val difference = a - b  // Вычитание: 5 - 3 = 2
        val product = a * b  // Умножение: 5 * 3 = 15
        val quotient = a / b  // Деление: 5 / 3 = 1 (целочисленное деление)
        val remainder = a % b  // Модуль: 5 % 3 = 2 (остаток от деления)
        var num = 10
        num += 5  // Теперь num равно 15 (10 + 5)
        num = 10
        num -= 3  // Теперь num равно 7 (10 - 3)
        num = 5
        num *= 2  // Теперь num равно 10 (5 * 2)
        num = 10
        num /= 2  // Теперь num равно 5 (10 / 2)
        num = 10
        num++  // Теперь num равно 11
        num = 10
        num--  // Теперь num равно 9


        num = 5
        var result = ++num // Инкремент: сначала увеличиваем num на 1, затем используем его значение в выражении
        println(result) // Выведет 6
        num = 5
        result = --num // Декремент: сначала уменьшаем num на 1, затем используем его значение в выражении
        println(result) // Выведет 4

        num = 5
        result = num++ // Постфиксный инкремент: сначала используем значение num в выражении, затем увеличиваем его на 1
        println(result) // Выведет 5
        println(num) // Теперь num равно 6
        num = 5
        result = num-- // Постфиксный декремент: сначала используем значение num в выражении, затем уменьшаем его на 1
        println(result) // Выведет 5
        println(num) // Теперь num равно 4


        // Читаем ввод с консоли и переводим в число enteredString одноразовая история использования
        fun defConvert() {
            // Выводим приглашение для ввода
            println("Введите целое число ")
            val enteredString = readlnOrNull()
            val enteredInt = enteredString!!.toInt() // Используем !! для проверки, что переменная не пустая
            val enteredByte = enteredString.toByte()
            val enteredShort = enteredString.toShort()
            val enteredLong = enteredString.toLong()

            // Выводим числа обратно в консоль
            println(enteredInt) // Введенное число (Int)
            println(enteredByte) // Введенное число (Byte)
            println(enteredShort) // Введенное число (Short)
            println(enteredLong) // Введенное число (Long)
        }


        println("read first char of  string")
        val firstSymbol = readlnOrNull()!![0] //чтение 1 символа строки
        val char1: Char = 'A'
        val code: Int = char1.code  // Получение символа 'A' как числа 65
        val char2: Char = 'B'
        val digit: Char = '7'
        val resultChar: Boolean = char1 < char2  // Результатом будет true, так как в алфавите символ 'A' меньше 'B'
        val isLetter: Boolean = char1.isLetter()  // Результатом будет true
        val isDigit: Boolean = digit.isDigit()     // Результатом будет true
        val upperCaseLetter: Char = char1.uppercaseChar()  // Результатом будет 'A'
        val lowerCaseLetter: Char = upperCaseLetter.lowercaseChar()  // Результатом будет 'a'

        val emptyString = String()
        val name = "Alice"
        val greeting = "Привет, $name!" // Результат: "Привет, Alice!"
        val expression =
            "Вычисление выражений ${name[0]}${name.length} ${2 + 2}" // Результат: Вычисление выражений A5 4"
        val multiline = """
            |Это многострочная строка.
            |Здесь можно писать текст
            |на нескольких строках.
        """.trimMargin()//без пробелов


        val sb = StringBuilder("Hello")
        sb.append(" world") // Добавление к текущей строке
        println(sb.toString()) // Проверка промежуточного результата: "Hello world"
        sb.insert(5, ", Kotlin") // Вставка в позицию 5
        println(sb.toString()) // Проверка промежуточного результата: "Hello, Kotlin world"
        sb.delete(5, 13) // Удаление подстроки с 5 по 12 символ, чтобы оставалось "Hello world"
        println(sb.toString()) // Проверка промежуточного результата: "Hello world"
        sb.replace(0, 5, "Hi") // Замена первых 5 символов на "Hi"
        println(sb.toString()) // Ожидаемый результат: "Hi world"

        var nullableVariable: Int? = null
        val strOrNull: String? = "Хелло" // Тут любая строка или null

        nullableVariable?.let {
            // Блок кода, который будет выполнен, если nullableVariable не является null
            println(it)
        }
        val str: String? = "Хелло" // Тут любая строка или null

        val strLength: Int? =
            str as? Int // Если преобразование не удается, возвращает null вместо выброса исключения ClassCastException.
        val defaultValue = 0
        val resultDefaultValue = nullableVariable ?: defaultValue
    }
}