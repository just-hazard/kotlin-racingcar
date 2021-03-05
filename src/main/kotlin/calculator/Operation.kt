package calculator

import java.util.*
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



//    protected fun arithmeticOperationCheck(arithmeticOperation: String): Operation? {
//        return Arrays.stream(values())
//            .filter { o: Operation -> o.arithmeticOperation == arithmeticOperation }
//            .findAny().orElseThrow { IllegalArgumentException() }
//    }
}
