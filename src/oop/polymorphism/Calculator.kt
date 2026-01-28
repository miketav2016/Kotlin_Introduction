package oop.polymorphism

class Calculator {
    companion object {
        fun calculate(x: Int, y: Int): Int {
            return x + y
        }

        fun calculate(x: Double, y: Double): Double {
            return x * y
        }

        fun calculate(x: String, y: String): String {
            return x + y
        }

        fun add(x: Int, y: Int): Double {
            return (x + y).toDouble()
        }
        fun add(x: Double, y: Double): Double {
            return x + y
        }
        fun subtract(x: Int, y: Int): Double {
            return (x - y).toDouble()
        }
        fun subtract(x: Double, y: Double): Double {
            return x - y
        }
        fun multiply(x: Int, y: Int): Double {
            return (x * y).toDouble()
        }
        fun multiply(x: Double, y: Double): Double {
            return x * y
        }
        fun divide(x: Int, y: Int): Double {
            return x.toDouble() / y.toDouble()
        }
        fun divide(x: Double, y: Double): Double {
            return x / y
        }
    }
}