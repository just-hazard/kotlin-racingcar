package calculator.racingcar.view

import calculator.racingcar.domain.Car

class ResultView {
    fun carPositionPrints(car: List<Car>) {
        car.forEach {
            carPositionPrint(it)
        }
    }

    private fun carNamePrint(car: Car) {
        print("${car.getCarName()} : ")
    }

    private fun carPositionPrint(car: Car) {
        carNamePrint(car)
        (0..car.carPosition()).forEach { _ ->
            print("-")
        }
        println()
    }

    fun winnersNamePrints(winners: String) {
        print("$winners 가 최종 우승했습니다.")
    }
}
