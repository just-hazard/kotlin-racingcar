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
    fun 이동거리_증가_테스트() {
        car.addDistance()
        assertThat(car.distance).isEqualTo(1)
        car.addDistance()
        assertThat(car.distance).isEqualTo(2)
        car.addDistance()
        assertThat(car.distance).isEqualTo(3)
    }
}
