import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class FindTheHighestAltitudeTest{

    private final FindTheHighestAltitude altitude = new FindTheHighestAltitude();

    @Test
    public void testLargestAltitudeWithPositiveGain() {
        int[] gain = {1, 2, 3, 4, 5};
        assertEquals(15, altitude.largestAltitude(gain));
    }

    @Test
    public void testLargestAltitudeWithNegativeGain() {
        int[] gain = {-5, -4, -3, -2, -1};
        assertEquals(0, altitude.largestAltitude(gain));
    }

    @Test
    public void testLargestAltitudeWithZeroGain() {
        int[] gain = {0, 0, 0, 0, 0};
        assertEquals(0, altitude.largestAltitude(gain));
    }

    @Test
    public void testLargestAltitudeWithEmptyArray() {
        int[] gain = {};
        assertEquals(0, altitude.largestAltitude(gain));
    }

    @Test
    public void testLargestAltitudeWithMixedArray() {
        int[] gain = {-4, 3, -2, -7, 4, 32, 11, -9};
        assertEquals(37, altitude.largestAltitude(gain));
    }

}