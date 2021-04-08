package calculator.racingcar.service

import calculator.racingcar.domain.Car
import calculator.racingcar.domain.Cars

class Racing(private val createCarNames : String, private val moveCarCount: Int) {

    private var cars = Cars(createCarNames)

    init {
        validationMoveOfCar()
    }

    private fun validationMoveOfCar() {
        for(i in 1..moveCarCount)
            move()
    }

    private fun move() {
        cars.moveOfCars()
    }

    fun getCarPositionList(): List<Car> {
        return cars.cars
    }
}
