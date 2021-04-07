package calculator.racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CarTest {

    private lateinit var car: Car

    @BeforeEach
    fun setUp() {
        car = Car()
    }

    @Test
    fun 차량_이동_테스트() {
        car.moveOfCar { false }
        assertThat(car.carPosition()).isEqualTo(0)

        car.moveOfCar { true }
        assertThat(car.carPosition()).isEqualTo(1)
    }
}
