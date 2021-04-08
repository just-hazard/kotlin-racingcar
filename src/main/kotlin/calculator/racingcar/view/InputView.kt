package calculator.racingcar.view

import java.util.*

class InputView(private val sc: Scanner = Scanner(System.`in`)) {

    fun createNumberOfCars(): String {
        writePrint("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)")
        return sc.nextLine()
    }

    fun createNumberOfMoves(): Int {
        writePrint("시도할 회수는 몇 회 인가요?")
        return sc.nextInt()
    }

    private fun writePrint(sentence: String) {
        println(sentence)
    }
}
