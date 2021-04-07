package calculator.racingcar.controller

import calculator.racingcar.service.Racing
import calculator.racingcar.view.InputView
import calculator.racingcar.view.ResultView

fun main() {
    val inputView = InputView()
    val resultView = ResultView()
    val racing = Racing(inputView.createNumberOfCars(),inputView.createNumberOfMoves())
    resultView.carPositionPrints(racing.getCarPositionList())
}
