package calculator.racingcar.domain

class Car (var distance: Int = 0) {

    fun  addDistance(): Unit {
        distance += 1
    }
}
