import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
public class MinCostClimbingStairsTest{

    private final MinCostClimbingStairs solution = new MinCostClimbingStairs();

    @Test
    public void testMinCostClimbingStairsSmallStaircase() {
        int[] cost = {10, 15, 20};
        assertEquals(15, solution.minCostClimbingStairs(cost));
    }

    @Test
    public void testMinCostClimbingStairsLargeStaircase() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, solution.minCostClimbingStairs(cost));
    }

    @Test
    public void testMinCostClimbingStairsTwoSteps() {
        int[] cost = {1, 2};
        assertEquals(1, solution.minCostClimbingStairs(cost));
    }

    @Test
    public void testMinCostClimbingStairsZeroCostSteps() {
        int[] cost = {0, 0, 0, 0};
        assertEquals(0, solution.minCostClimbingStairs(cost));
    }

}