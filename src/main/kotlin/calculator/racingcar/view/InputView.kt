package calculator.racingcar.view

import java.util.*

class InputView(private val sc: Scanner = Scanner(System.`in`)) {

    fun createNumberOfCars(): Int {
        writePrint("자동차 대수는 몇대 인가요?")
        return sc.nextInt()
    }

    fun createNumberOfMoves(): Int {
        writePrint("시도할 회수는 몇 회 인가요?")
        return sc.nextInt()
    }

    private fun writePrint(sentence: String) {
        println(sentence)
    }
}
