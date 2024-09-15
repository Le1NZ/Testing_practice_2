import org.example.IntListUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SumBetweenIndexesTest {

    private val utils = IntListUtils

    @Test
    fun test_sumBetweenIndexes_fromStart() {
        val expected = 6
        assertEquals(
            expected = expected,
            actual = utils.sumBetweenIndexes(
                list = listOf(1, 2, 3, 4, 5),
                start = 0,
                end = 2,
            ),
        )
    }

    @Test
    fun test_sumBetweenIndexes_toEnd() {
        val expected = 9
        assertEquals(
            expected = expected,
            actual = utils.sumBetweenIndexes(
                list = listOf(1, 2, 3, 4, 5),
                start = 3,
                end = 4,
            ),
        )
    }

    @Test
    fun test_sumBetweenIndexes_inMiddle() {
        val expected = 9
        assertEquals(
            expected = expected,
            actual = utils.sumBetweenIndexes(
                list = listOf(1, 2, 3, 4, 5),
                start = 1,
                end = 3,
            ),
        )
    }

    @Test
    fun test_sumBetweenIndexes_empty() {
        val expected = null
        assertEquals(
            expected = expected,
            actual = utils.sumBetweenIndexes(
                list = listOf(),
                start = 1,
                end = 3,
            ),
        )
    }

    @Test
    fun test_sumBetweenIndexes_negativeIndexes() {
        val expected = null
        assertEquals(
            expected = expected,
            actual = utils.sumBetweenIndexes(
                list = listOf(),
                start = -1,
                end = 3,
            ),
        )
    }
}