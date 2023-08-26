import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {

    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void testMaxArea() {
        int[] nums = new int[]{4,3,2,1,4};
        assertEquals(16, containerWithMostWater.maxArea(nums));
    }

    @Test
    public void testMaxAreaEmptyArr() {
        int[] nums = new int[]{};
        assertEquals(0, containerWithMostWater.maxArea(nums));
    }

    @Test
    public void testMaxAreaAllZeros() {
        int[] nums = new int[]{0,0,0,0,0,0,0};
        assertEquals(0, containerWithMostWater.maxArea(nums));
    }

    @Test
    public void testMaxAreaNumbersInARow() {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        assertEquals(12, containerWithMostWater.maxArea(nums));
    }


}