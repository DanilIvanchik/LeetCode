import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class UniqueNumberOfOccurrencesTest {
    private final UniqueNumberOfOccurrences number = new UniqueNumberOfOccurrences();

    @Test
    public void testUniqueOccurrencesWithEmptyArray() {
        int[] arr = new int[0];
        assertFalse(number.uniqueOccurrences(arr));
    }

    @Test
    public void testUniqueOccurrencesWithNullArray() {
        int[] arr = null;
        assertFalse(number.uniqueOccurrences(arr));
    }

    @Test
    public void testUniqueOccurrencesWithNonUniqueOccurrences() {
        int[] arr = {1, 2, 2, 3, 3, 3};
        assertTrue(number.uniqueOccurrences(arr));
    }

    @Test
    public void testUniqueOccurrencesWithUniqueOccurrences() {
        int[] arr = {1, 2, 2, 3, 3, 4};
        assertFalse(number.uniqueOccurrences(arr));
    }
}