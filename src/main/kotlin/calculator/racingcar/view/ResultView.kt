package calculator.racingcar.view

import calculator.racingcar.domain.Car

class ResultView {
    fun carPositionPrints(car: List<Car>) {
        car.forEach {
            carPositionPrint(it)
        }
    }

    private fun carPositionPrint(car: Car) {
        (0..car.carPosition()).forEach { _ ->
            print("-")
        }
        println()
    }
}
