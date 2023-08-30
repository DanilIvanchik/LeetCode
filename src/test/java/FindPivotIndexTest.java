import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

    public class FindPivotIndexTest{

        private final FindPivotIndex index = new FindPivotIndex();

        @Test
        public void testPivotIndexWithEmptyArray() {
            int[] nums = {};
            assertEquals(-1, index.pivotIndex(nums));
        }

        @Test
        public void testPivotIndexWithArrayContainingZeros() {
            int[] nums = {0, 0, 0, 0};
            assertEquals(0, index.pivotIndex(nums));
        }

        @Test
        public void testPivotIndexWithArrayContainingNoPivot() {
            int[] nums = {1, 2, 3};
            assertEquals(-1, index.pivotIndex(nums));
        }

        @Test
        public void testPivotIndexWithArrayContainingSingleElement() {
            int[] nums = {5};
            assertEquals(0, index.pivotIndex(nums));
        }

        @Test
        public void testPivotIndexWithArrayContainingPivot() {
            int[] nums = {1, 7, 3, 6, 5, 6};
            assertEquals(3, index.pivotIndex(nums));
        }

    }