package calculator.racingcar.service

import calculator.racingcar.domain.CarMovingStrategy
import calculator.racingcar.domain.MovingStrategy
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RacingTest {

    private lateinit var racing: Racing

    @BeforeEach
    fun setUp() {
        racing = Racing(1,0)
    }

    @Test
    fun 차량_이동_테스트() {
        racing.getCarPositionList().forEach { it.moveOfCar { true } }
        assertThat(racing.getCarPositionList()[0].carPosition()).isEqualTo(1)
    }
}
