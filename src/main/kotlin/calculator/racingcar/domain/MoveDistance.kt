package calculator.racingcar.domain

class MoveDistance(var distance: Int = 0) {

    fun move() {
        distance += 1
    }
}
