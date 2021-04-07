package calculator.racingcar.domain

import java.util.*


class CarMovingStrategy : MovingStrategy {

    companion object {
        private const val MOVE_CONDITION = 4
        private const val RAN_NUMBER_RANGE = 10
    }
    private val random = Random()

    override fun movable(): Boolean {
        return MOVE_CONDITION <= randomNumber()
    }

    private fun randomNumber(): Int {
        return random.nextInt(RAN_NUMBER_RANGE)
    }
}
