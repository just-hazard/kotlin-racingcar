package calculator.racingcar.domain

import kotlin.math.max

class MoveDistance(var distance: Int = 0) {

    fun move() {
        distance += 1
    }

    fun isMaxPosition(maxPosition: Int): Int {
        return max(distance, maxPosition)
    }

    fun isSamePosition(maxPosition: Int): Boolean {
        return distance == maxPosition
    }
}
