package calculator.racingcar.domain

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat


class CarsTest {
    private lateinit var cars: Cars

    @Test
    fun 자동차_객체_생성_테스트() {
        cars = Cars("자동차,자동차1,자동차2,차동차3,자동차4")
        assertThat(cars.cars.size).isEqualTo(5)
        assertThat(cars.cars[2].getCarName()).isEqualTo("자동차2")
    }
}
