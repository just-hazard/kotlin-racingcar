import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import java.lang.IndexOutOfBoundsException

class StringStudyTest {
    @Test
    fun 문자열_자르기_테스트() {
        assertThat("1,2".split(",")).containsExactly("1","2")
    }

    @Test
    fun 한자리_문자열_자르기_테스트() {
        assertThat("1".split(",")).containsExactly("1")
    }

    @Test
    fun subString_활용() {
        assertThat("(1,2)".substring(1,4)).isEqualTo("1,2")
    }

    @Test
    fun charAt_활용() {
        assertThat("abc"[1]).isEqualTo('b')
    }

    @Test
    fun charAt_예외발생() {
        assertThatThrownBy {
            "abc"[4]
        }.isInstanceOf(IndexOutOfBoundsException::class.java)
            .hasMessageContaining("String index out of range: 4")
    }
}
