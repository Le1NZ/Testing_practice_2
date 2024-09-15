import org.example.IntListUtils
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FirstIndexOfTargetElementText {

    private val utils = IntListUtils

    @Test
    fun test_firstIndexOfTargetElement_common() {
        val expected = 1
        assertEquals(
            expected = expected,
            actual = utils.firstIndexOfTargetElement(
                list = listOf(1, 2, 3, 4, 5),
                target = 2,
            ),
        )
    }

    @Test
    fun test_firstIndexOfTargetElement_empty() {
        val expected = null
        assertEquals(
            expected = expected,
            actual = utils.firstIndexOfTargetElement(
                list = listOf(),
                target = 10,
            ),
        )
    }

    @Test
    fun test_firstIndexOfTargetElement_notIncluded() {
        val expected = null
        assertEquals(
            expected = expected,
            actual = utils.firstIndexOfTargetElement(
                list = listOf(-2, 2, 0, 1, -4),
                target = 3,
            ),
        )
    }
}