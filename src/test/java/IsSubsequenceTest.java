import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class IsSubsequenceTest{

    private final IsSubsequence isSubsequence = new IsSubsequence();

    @Test
    public void testIsSubsequenceBothEmptyStringsReturnsTrue() {
        assertTrue(isSubsequence.isSubsequence("", ""));
    }

    @Test
    public void testIsSubsequenceEmptyStringAsSReturnsTrue() {
        assertTrue(isSubsequence.isSubsequence("", "abcdefg"));
    }

    @Test
    public void testIsSubsequenceEmptyStringAsTReturnsFalse() {
        assertFalse(isSubsequence.isSubsequence("abc", ""));
    }

    @Test
    public void testIsSubsequenceSIsSubsequenceOfTReturnsTrue() {
        assertTrue(isSubsequence.isSubsequence("abc", "aabbcc"));
    }

    @Test
    public void testIsSubsequenceSIsNotSubsequenceOfTReturnsFalse() {
        assertFalse(isSubsequence.isSubsequence("xyz", "abcdefg"));
    }

    @Test
    public void testIsSubsequenceSIsEqualToTReturnsTrue() {
        assertTrue(isSubsequence.isSubsequence("hello", "hello"));
    }

}