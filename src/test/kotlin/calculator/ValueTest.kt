package calculator

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatExceptionOfType
import org.junit.jupiter.api.Test

internal class ValueTest {
    @Test
    internal fun 널체크() {
        assertThatExceptionOfType(NullPointerException::class.java).isThrownBy {
            Value(null)
        }
    }

    @Test
    internal fun 빈값체크() {
        assertThatExceptionOfType(IllegalArgumentException::class.java).isThrownBy {
            Value("")
        }
    }

    @Test
    internal fun 문자열_자르기() {
        assertThat(Value("1 + 2 + 3 - 4").valueSplit()).size().isEqualTo(7)
    }
}
