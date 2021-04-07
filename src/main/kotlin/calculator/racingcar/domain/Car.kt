package calculator.racingcar.domain


class Car {

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
