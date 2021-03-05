package calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class OperationTest {

    @ParameterizedTest
    @CsvSource("2:3:5","-1:5:4", "-3:-5:-8", delimiter = ':')
    fun 더하기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(Operation.PLUS.operation(firstValue, secondValue)).isEqualTo(result)
    }

    @ParameterizedTest
    @CsvSource("5:2:3","-3:-2:-1", "10:5:5", delimiter = ':')
    fun 빼기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(MINUS.operation(firstValue, secondValue)).isEqualTo(result)
    }

    @ParameterizedTest
    @CsvSource("5:2:10","2:2:4", "10:5:50", delimiter = ':')
    fun 곱하기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(MULTIPLY.operation(firstValue, secondValue)).isEqualTo(result)
    }

    @ParameterizedTest
    @CsvSource("10:2:5","2:2:1", "10:5:2", delimiter = ':')
    fun 나누기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(DIVISION.operation(firstValue, secondValue)).isEqualTo(result)
    }
}
