package calculator.racingcar.domain

import calculator.arithmeticOperationCheck
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

class CarsTest {
    private lateinit var cars: Cars

    @Test
    internal fun 자동차_객체가_없을시() {
        Assertions.assertThatIllegalArgumentException().isThrownBy {
            cars = Cars(listOf())
        }.withMessage("자동차 등록은 필수입니다.")
    }
}
