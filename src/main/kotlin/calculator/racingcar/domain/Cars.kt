package calculator.racingcar.domain


class Cars(private val carNames: String) {

    companion object {
        private const val COMMA = ","
    }

    val cars: List<Car>
    private val carMovingStrategy = CarMovingStrategy()

    init {
        cars = registerCar(carNames)
    }

    private fun registerCar(carNames: String): List<Car> {
        return carNames.split(COMMA).map { Car(Name(it)) }
    }

    fun moveOfCars() {
        cars.forEach{ it.moveOfCar(carMovingStrategy)}
    }
}
