import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class DailyTemperaturesTest{

    private final DailyTemperatures solution = new DailyTemperatures();

    @Test
    public void testDailyTemperatures_AllZero() {
        int[] T = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(T));
    }

    @Test
    public void testDailyTemperatures_IncreasingTemperatures() {
        int[] T = {30, 40, 50, 60, 70};
        int[] expected = {1, 1, 1, 1, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(T));
    }

    @Test
    public void testDailyTemperatures_DecreasingTemperatures() {
        int[] T = {70, 60, 50, 40, 30};
        int[] expected = {0, 0, 0, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(T));
    }

    @Test
    public void testDailyTemperatures_FluctuatingTemperatures() {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertArrayEquals(expected, solution.dailyTemperatures(T));
    }

    @Test
    public void testDailyTemperatures_EmptyArray() {
        int[] T = {};
        int[] expected = {};
        assertArrayEquals(expected, solution.dailyTemperatures(T));
    }

}