import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxConsecutiveOnesIIITest{

    private final MaxConsecutiveOnesIII maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();

    @Test
    public void test1() {
        int[] nums = {1, 1, 0, 0, 1, 1, 1, 0, 1, 0};
        int k = 2;
        int expected = 7;
        int result = maxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void test2() {
        int[] nums = {1, 0, 0, 0, 1, 1, 1, 0, 1, 0};
        int k = 2;
        int expected = 6;
        int result = maxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void test3() {
        int[] nums = {1, 1, 1, 1, 1};
        int k = 0;
        int expected = 5;
        int result = maxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void test4() {
        int[] nums = {0, 0, 0, 0};
        int k = 4;
        int expected = 4;
        int result = maxConsecutiveOnesIII.longestOnes(nums, k);
        assertEquals(expected, result);
    }

}