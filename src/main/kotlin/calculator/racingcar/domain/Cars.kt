package calculator.racingcar.domain

import java.util.stream.Collectors.joining


class Cars(private val carNames: String) {

    companion object {
        private const val COMMA = ","
        private const val COMMA_SPACE = ", "
    }

    val cars: List<Car>
    private val carMovingStrategy = CarMovingStrategy()

    init {
        cars = registerCar(carNames)
    }

    private fun registerCar(carNames: String): List<Car> {
        return carNames.split(COMMA).map { Car(Name(it)) }
    }

    fun moveOfCars() {
        cars.forEach{ it.moveOfCar(carMovingStrategy)}
    }

    fun winners(): String {
        val maxPosition = carMaxPosition()
        return cars.filter {
            it.isWinner(maxPosition)
        }.stream().map {
            it.getCarName()
        }.collect(joining(COMMA_SPACE))
    }

    private fun carMaxPosition(): Int {
        var maxPosition = 0
        for(car in cars) {
            maxPosition = car.maxPosition(maxPosition)
        }
        return maxPosition
    }
}
