import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class SingleNumberTest{

    @Test
    public void testSingleNumber() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {1, 3, 3, 4, 4};
        int expected = 1;
        int actual = singleNumber.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyArr() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {};
        int expected = 0;
        int actual = singleNumber.singleNumber(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testNumbers() {
        SingleNumber singleNumber = new SingleNumber();
        int[] nums = {5, 7, 9, 2, 5, 7, 9};
        int expected = 2;
        int actual = singleNumber.singleNumber(nums);
        assertEquals(expected, actual);
    }

}