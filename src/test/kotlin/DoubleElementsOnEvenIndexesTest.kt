import org.example.IntListUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DoubleElementsOnEvenIndexesTest {

    private val utils = IntListUtils

    @Test
    fun test_doubleElementsOnEvenIndexes_common() {
        val expected = listOf(2, 2, 6, 4, 10)
        assertEquals(
            expected = expected,
            actual = utils.doubleElementsOnEvenIndexes(
                list = listOf(1, 2, 3, 4, 5),
            ),
        )
    }

    @Test
    fun test_doubleElementsOnEvenIndexes_empty() {
        val expected = listOf<Int>()
        assertEquals(
            expected = expected,
            actual = utils.doubleElementsOnEvenIndexes(
                list = listOf(),
            ),
        )
    }

    @Test
    fun test_doubleElementsOnEvenIndexes_notIncluded() {
        val expected = listOf(-4, 2, 0, 1, -8)
        assertEquals(
            expected = expected,
            actual = utils.doubleElementsOnEvenIndexes(
                list = listOf(-2, 2, 0, 1, -4),
            ),
        )
    }
}