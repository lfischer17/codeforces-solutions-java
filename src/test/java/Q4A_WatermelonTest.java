import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luthfi
 * @since 1.0.0
 */
class Q4A_WatermelonTest {

    @Test
    void test1() {

        final int w = 8;

        final String actual = Q4A_Watermelon.isValidWatermelonToFormattedString(w);
        final String expected = "YES";

        assertEquals(expected, actual);
    }

    @Test
    void test2() {

        final int w = 5;

        final String actual = Q4A_Watermelon.isValidWatermelonToFormattedString(w);
        final String expected = "NO";

        assertEquals(expected, actual);
    }

    @Test
    void test3() {

        final int w = 2;

        final String actual = Q4A_Watermelon.isValidWatermelonToFormattedString(w);
        final String expected = "NO";

        assertEquals(expected, actual);
    }
}