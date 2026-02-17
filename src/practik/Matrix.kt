package practik
import kotlinx.coroutines.*
import java.util.Scanner
import kotlin.random.Random


object Matrix {
    // 1. Линейное умножение
    fun multiplyLinear(A: Array<DoubleArray>, B: Array<DoubleArray>): Array<DoubleArray> {
        val n = A.size
        val C = Array(n) { DoubleArray(n) }
        for (i in 0 until n) {
            for (j in 0 until n) {
                for (k in 0 until n) {
                    C[i][j] += A[i][k] * B[k][j]
                }
            }
        }
        return C
    }

    // 2. Параллельное умножение
    suspend fun multiplyParallel(A: Array<DoubleArray>,
                                 B: Array<DoubleArray>,
                                 myDispatcher: kotlinx.coroutines.CoroutineDispatcher = Dispatchers.Default): Array<DoubleArray> = coroutineScope {
        val n = A.size
        val C = Array(n) { DoubleArray(n) }

        val jobs = List(n) { i ->
            launch(myDispatcher) {
                for (j in 0 until n) {
                    var sum = 0.0
                    for (k in 0 until n) {
                        sum += A[i][k] * B[k][j]
                    }
                    C[i][j] = sum
                }
            }
        }
        jobs.joinAll()
        return@coroutineScope C
    }

    // 3. Метод генерации матрицы
    fun generateMatrix(n: Int): Array<DoubleArray> {
        return Array(n) { DoubleArray(n) { Random.nextDouble(0.0, 10.0) } }
    }

    // ОСНОВНОЙ МЕТОД
    fun multiplyMatrix() = runBlocking {
        val scanner = Scanner(System.`in`)

        val cores = Runtime.getRuntime().availableProcessors()
        println("Количество доступных ядер процессора: $cores")
        println("Сколько доступных ядер выделить? ")
        val myCores = readlnOrNull()?.toIntOrNull() ?: 6
        val dDispatcher = Dispatchers.Default.limitedParallelism(myCores)

        print("Введите размерность квадратных матриц (n): ")
        val n = if (scanner.hasNextInt()) scanner.nextInt() else 0

        if (n <= 0) {
            println("Размерность должна быть больше 0")
            return@runBlocking
        }

        println("Генерация матриц $n x $n...")
        val matrixA = generateMatrix(n)
        println("Генерация matrixA done")
        val matrixB = generateMatrix(n)
        println("Генерация matrixB done")

        // Замер линейного метода
        println("Линейное умножение заняло")
        val startLinear = System.currentTimeMillis()
        multiplyLinear(matrixA, matrixB)
        val endLinear = System.currentTimeMillis()
        println("Линейное умножение заняло: ${endLinear - startLinear} мс")

        // Замер параллельного метода
        println("Параллельное умножение заняло")
        val startParallel = System.currentTimeMillis()
        multiplyParallel(matrixA, matrixB, dDispatcher)
        val endParallel = System.currentTimeMillis()
        println("Параллельное умножение заняло: ${endParallel - startParallel} мс")
    }

}


