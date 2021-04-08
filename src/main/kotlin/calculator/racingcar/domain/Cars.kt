package calculator.racingcar.domain


class Cars(private val carNames: String) {

    val cars: List<Car>
    private val carMovingStrategy = CarMovingStrategy()

    init {
        cars = registerCar(carNames)
    }

    private fun registerCar(carNames: String): List<Car> {
        return carNames.split(",").map { Car(Name(it)) }
//        return List(size = carNames, init = { Car() })
    }

    fun moveOfCars() {
        cars.forEach{ it.moveOfCar(carMovingStrategy)}
    }
}
