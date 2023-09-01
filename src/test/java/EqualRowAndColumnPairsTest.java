import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EqualRowAndColumnPairsTest extends ProductOfArrayExceptSelf {

    private final EqualRowAndColumnPairs equalRowAndColumnPairs = new EqualRowAndColumnPairs();

    @Test
    public void testEqualPairsWithZeroMatrix() {
        int[][] zeroMatrix = new int[][]{
                {0, 0},
                {0, 0},
        };
        int result = equalRowAndColumnPairs.equalPairs(zeroMatrix);
        assertEquals(4, result);
    }

    @Test
    public void testEqualPairsWithNonZeroMatrix() {
        int[][] nonZeroMatrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
        };
        int result = equalRowAndColumnPairs.equalPairs(nonZeroMatrix);
        assertEquals(0, result);
    }

}