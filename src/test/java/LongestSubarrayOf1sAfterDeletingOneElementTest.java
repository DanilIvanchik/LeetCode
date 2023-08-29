import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class LongestSubarrayOf1sAfterDeletingOneElementTest{

    private final LongestSubarrayOf1sAfterDeletingOneElement element = new LongestSubarrayOf1sAfterDeletingOneElement();

    @Test
    public void testLongestSubarrayWithMixedValues() {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        assertEquals(4, element.longestSubarray(nums));
    }

    @Test
    public void testLongestSubarrayWithAllZeros() {
        int[] nums = {0, 0, 0};
        assertEquals(0, element.longestSubarray(nums));
    }

    @Test
    public void testLongestSubarrayWithAllOnes() {
        int[] nums = {1, 1, 1};
        assertEquals(2, element.longestSubarray(nums));
    }

    @Test
    public void testLongestSubarrayWithAlternatingValues() {
        int[] nums = {1, 0, 1, 0, 1, 0};
        assertEquals(2, element.longestSubarray(nums));
    }

    @Test
    public void testLongestSubarrayWithEmptyArray() {
        int[] nums = {};
        assertEquals(0, element.longestSubarray(nums));
    }

}