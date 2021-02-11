import org.junit.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val cases = arrayOf(
        Triple(arrayOf(7, 5, 1, 6, 2, 9, 4, 3, 8), arrayOf(1, 5, 2, 6, 9, 7, 3, 4, 8), arrayOf(1, 2, 9, 6, 5, 3, 8, 4, 7)),
        Triple(arrayOf(1, 2, 3), arrayOf(2, 1, 3), arrayOf(2, 3, 1)),
        Triple(arrayOf(2, 3, 1), arrayOf(1, 2, 3), null),
        Triple(arrayOf(9, 6, 7, 2, 3, 4, 5, 8), arrayOf(7, 6, 3, 2, 4, 9, 8, 5), arrayOf(7, 3, 4, 2, 6, 8, 5, 9))
    )

    @Test
    fun test() {
        cases.forEach {
            assertEquals(Solution().solve(it.first, it.second).contentEquals(it.third), true)
        }
    }
}