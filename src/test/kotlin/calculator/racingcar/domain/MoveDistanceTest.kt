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

    @Test
    internal fun 최대_이동거리_구하기() {
        val moveDistance = MoveDistance(2)
        assertThat(moveDistance.isMaxPosition(4)).isEqualTo(4)
    }

    @Test
    internal fun 같은_이동거리_체크() {
        val moveDistance = MoveDistance(2)
        assertThat(moveDistance.isSamePosition(2)).isTrue
    }
}
