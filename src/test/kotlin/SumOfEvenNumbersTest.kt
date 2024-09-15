import org.example.IntListUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumOfEvenNumbersTest {

    private val utils = IntListUtils

    @Test
    fun test_sumOfEvenNumbers_common() {
        val expected = 6
        assertEquals(
            expected = expected,
            actual = utils.sumOfEvenNumbers(
                list = listOf(1, 2, 3, 4, 5),
            ),
        )
    }

    @Test
    fun test_sumOfEvenNumbers_empty() {
        val expected = 0
        assertEquals(
            expected = expected,
            actual = utils.sumOfEvenNumbers(
                list = listOf(),
            ),
        )
    }

    @Test
    fun test_sumOfEvenNumbers_negative() {
        val expected = -4
        assertEquals(
            expected = expected,
            actual = utils.sumOfEvenNumbers(
                list = listOf(-2, 2, 0, 1, -4),
            ),
        )
    }
}