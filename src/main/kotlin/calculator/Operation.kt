package calculator

import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

enum class Operation : BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
        override fun apply(firstValue: Int, secondValue: Int): Int = firstValue + secondValue
    },
    MINUS {
        override fun apply(firstValue: Int, secondValue: Int): Int = firstValue - secondValue
    },
    MULTIPLY {
        override fun apply(firstValue: Int, secondValue: Int): Int = firstValue * secondValue
    },
    DIVISION {
        override fun apply(firstValue: Int, secondValue: Int): Int = firstValue / secondValue
    };

    override fun applyAsInt(firstValue: Int, secondValue: Int): Int = apply(firstValue, secondValue)
}

fun arithmeticOperationCheck(arithmeticOperation: String, values: Pair<Int,Int> ): Int {
    return when (arithmeticOperation) {
        "+" -> Operation.PLUS.apply(values.first, values.second)
        "-" -> Operation.MINUS.apply(values.first, values.second)
        "*" -> Operation.MULTIPLY.apply(values.first, values.second)
        "/" -> if (values.toList().contains(0)) throw ArithmeticException()
                else Operation.DIVISION.apply(values.first, values.second)
        else -> throw IllegalArgumentException()
    }
}
