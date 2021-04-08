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
}
