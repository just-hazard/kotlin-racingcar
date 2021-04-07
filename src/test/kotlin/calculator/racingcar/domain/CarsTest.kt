package calculator.racingcar.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


class CarsTest {
    private lateinit var cars: Cars

    @Test
    fun 자동차_객체_생성_테스트() {
        cars = Cars(5)
        assertThat(cars.cars.size).isEqualTo(5)
    }
}
