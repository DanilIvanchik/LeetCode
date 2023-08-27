import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class MaxNumberOfKSumPairsTest{
    MaxNumberOfKSumPairs maxNumberOfKSumPairs = new MaxNumberOfKSumPairs();

    @Test
    public void MaxNumberOfKSumPairsTestArr(){
        int[] nums = new int[]{1,2,3,4,5};
        assertEquals(2, maxNumberOfKSumPairs.maxOperations(nums, 5));
    }
    @Test
    public void MaxNumberOfKSumPairsTestRandomArr(){
        int[] nums = new int[]{3,1,3,4,3};
        assertEquals(1, maxNumberOfKSumPairs.maxOperations(nums, 6));
    }
    @Test
    public void MaxNumberOfKSumPairsEmptyArr(){
        int[] nums = new int[]{};
        assertEquals(0, maxNumberOfKSumPairs.maxOperations(nums, 5));
    }

    @Test
    public void MaxNumberOfKSumPairsZeroArr(){
        int[] nums = new int[]{0,0,0,0,0,0,0,0,0};
        assertEquals(nums.length/2, maxNumberOfKSumPairs.maxOperations(nums, 0));
    }

}