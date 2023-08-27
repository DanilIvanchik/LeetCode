import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaximumAverageSubarrayTest{

    public final MaximumAverageSubarray maximumAverageSubarray = new MaximumAverageSubarray();

    @Test
    public void testFindMaxAverageWithPositiveNumbers() {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double expected = 12.75; // (12 - 5 - 6 + 50) / 4 = 12.75
        double result = maximumAverageSubarray.findMaxAverage(nums, k);
        assertEquals(expected, result, 0.001); // 0.001 is the tolerance for double comparison
    }

    @Test
    public void testFindMaxAverageWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4};
        int k = 2;
        double expected = -1.5; // (-1 - 2) / 2 = -1.5
        double result = maximumAverageSubarray.findMaxAverage(nums, k);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMaxAverageWithEmptyArray() {
        int[] nums = {};
        int k = 3;
        double expected = 0.0; // Empty array, so average should be 0
        double result = maximumAverageSubarray.findMaxAverage(nums, k);
        assertEquals(expected, result, 0.001);
    }

    @Test
    public void testFindMaxAverageWithKGreaterThanArrayLength() {
        int[] nums = {1, 2, 3};
        int k = 5;
        double expected = 0.0; // k is greater than array length, so average should be 0
        double result = maximumAverageSubarray.findMaxAverage(nums, k);
        assertEquals(expected, result, 0.001);
    }
}