package calculator

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class OperationTest {

    @ParameterizedTest
    @CsvSource("2:3:5","-1:5:4", "-3:-5:-8", delimiter = ':')
    fun 더하기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(Operation.PLUS.apply(firstValue, secondValue)).isEqualTo(result)
    }

    @ParameterizedTest
    @CsvSource("5:2:3","-3:-2:-1", "10:5:5", delimiter = ':')
    fun 빼기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(Operation.MINUS.apply(firstValue, secondValue)).isEqualTo(result)
    }

    @ParameterizedTest
    @CsvSource("5:2:10","2:2:4", "10:5:50", delimiter = ':')
    fun 곱하기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(Operation.MULTIPLY.apply(firstValue, secondValue)).isEqualTo(result)
    }

    @ParameterizedTest
    @CsvSource("10:2:5","2:2:1", "10:5:2", delimiter = ':')
    fun 나누기(firstValue: Int, secondValue: Int, result: Int) {
        assertThat(Operation.DIVISION.apply(firstValue, secondValue)).isEqualTo(result)
    }

    @Test
    fun 제로값으로_나눗셈() {
        assertThatExceptionOfType(ArithmeticException::class.java).isThrownBy {
            arithmeticOperationCheck("/",Pair(0,2))
        }
    }

    @ParameterizedTest
    @DisplayName("사칙연산 예외 기호 테스트 코드")
    @CsvSource(value = ["@", "%", "$", "&"])
    fun 사칙연산_예외_기호(arithmetic: String) {
        Assertions.assertThatIllegalArgumentException().isThrownBy {
            arithmeticOperationCheck(arithmetic,Pair(1,2))
        }
    }
}
