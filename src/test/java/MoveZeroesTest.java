import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class MoveZeroesTest{

    private MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void MoveZeroesToTheEndTest(){
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums1);
    }

    @Test
    public void MoveZeroesToTheEndWithNoZerosTest(){
        int[] nums2 = {1, 2, 3, 4, 5};
        moveZeroes.moveZeroes(nums2);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums2);
    }

    @Test
    public void MoveZeroesToTheEndAllZerosTest(){
        int[] nums3 = {0, 0, 0, 0, 0};
        moveZeroes.moveZeroes(nums3);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nums3);
    }

    @Test
    public void MoveZeroesToTheEndEmptyTest(){
        int[] nums4 = {};
        moveZeroes.moveZeroes(nums4);
        assertArrayEquals(new int[]{}, nums4);
    }



}