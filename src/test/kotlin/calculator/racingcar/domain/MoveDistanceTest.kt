package calculator.racingcar.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class MoveDistanceTest {
    @Test
    fun 차량_거리이동_검증() {
        val moveDistance = MoveDistance()
        moveDistance.move()
        assertThat(moveDistance.distance).isEqualTo(1)
    }
}
