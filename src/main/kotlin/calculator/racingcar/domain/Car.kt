package calculator.racingcar.domain


class Car(carName: Name) {

    private val name = carName
    private var moveDistance: MoveDistance = MoveDistance()

    fun moveOfCar(movingStrategy: MovingStrategy) {
        if(movingStrategy.movable()) {
            moveDistance.move()
        }
    }

    fun carPosition() : Int {
        return moveDistance.distance
    }

    fun getCarName(): String {
        return name.name
    }

    fun maxPosition(maxPosition: Int): Int {
        return moveDistance.isMaxPosition(maxPosition)
    }

    fun isWinner(maxPosition: Int): Boolean {
        return moveDistance.isSamePosition(maxPosition)
    }
}
