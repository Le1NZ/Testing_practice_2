import org.example.IntListUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountNumbersMoreThatAverageTest {

    private val utils = IntListUtils

    @Test
    fun test_countNumbersMoreThanAverage_common() {
        val expected = 2
        assertEquals(
            expected = expected,
            actual = utils.countNumbersMoreThanAverage(
                list = listOf(1, 2, 3, 4, 5),
            ),
        )
    }

    @Test
    fun test_countNumbersMoreThanAverage_empty() {
        val expected = 0
        assertEquals(
            expected = expected,
            actual = utils.countNumbersMoreThanAverage(
                list = listOf(),
            ),
        )
    }

    // failed
    @Test
    fun test_countNumbersMoreThanAverage_negative() {
        val expected = 3
        assertEquals(
            expected = expected,
            actual = utils.countNumbersMoreThanAverage(
                list = listOf(-2, 2, 0, 1, -4),
            ),
        )
    }
}