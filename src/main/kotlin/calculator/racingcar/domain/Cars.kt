package calculator.racingcar.domain


class Cars(private val number: Int) {

    val cars: List<Car>
    private val carMovingStrategy = CarMovingStrategy()

    init {
        cars = registerCar(number)
    }

    private fun registerCar(number: Int): List<Car> {
        return List(size = number, init = { Car() })
    }

    fun moveOfCars() {
        cars.forEach{ it.moveOfCar(carMovingStrategy)}
    }
}
