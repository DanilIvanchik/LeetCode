import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FindTheDifferenceOfTwoArraysTest{

    private final FindTheDifferenceOfTwoArrays difference = new FindTheDifferenceOfTwoArrays();

    @Test
    public void testFindDifferenceWithEmptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {};

        List<List<Integer>> result = difference.findDifference(nums1, nums2);

        assertEquals(0, result.get(0).size());
        assertEquals(0, result.get(1).size());
    }

    @Test
    public void testFindDifferenceWithNullArrays() {
        int[] nums1 = null;
        int[] nums2 = null;

        List<List<Integer>> result = difference.findDifference(nums1, nums2);

        assertNull(result.get(0));
        assertNull(result.get(1));
    }

    @Test
    public void testFindDifferenceWithCommonElements() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4};

        List<List<Integer>> result = difference.findDifference(nums1, nums2);

        assertEquals(Arrays.asList(1), result.get(0));
        assertEquals(Arrays.asList(4), result.get(1));
    }

    @Test
    public void testFindDifferenceWithNoCommonElements() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};

        List<List<Integer>> result = difference.findDifference(nums1, nums2);

        assertEquals(Arrays.asList(1, 2, 3), result.get(0));
        assertEquals(Arrays.asList(4, 5, 6), result.get(1));
    }

}