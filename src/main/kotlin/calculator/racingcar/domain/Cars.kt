package calculator.racingcar.domain

import java.lang.IllegalArgumentException

class Cars(cars: List<Car>) {

    init {
        require(cars.isNotEmpty()) {
            throw IllegalArgumentException("자동차 등록은 필수입니다.")
        }
    }
}
