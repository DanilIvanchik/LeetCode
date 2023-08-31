import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetermineIfTwoStringsAreCloseTest{

    private final DetermineIfTwoStringsAreClose areClose = new DetermineIfTwoStringsAreClose();

    @Test
    public void testCloseStringsWithEmptyStrings() {
        String word1 = "";
        String word2 = "";
        assertTrue(areClose.closeStrings(word1, word2));
    }

    @Test
    public void testCloseStringsWithMixedEmptyAndNonEmptyStrings() {
        String word1 = "abc";
        String word2 = "";
        assertFalse(areClose.closeStrings(word1, word2));
    }

    @Test
    public void testCloseStringsWithNoneCloseStrings() {
        String word1 = "abscscseb";
        String word2 = "bbawecwec";
        assertFalse(areClose.closeStrings(word1, word2));
    }

    @Test
    public void testCloseStringsWithCloseStrings() {
        String word1 = "ccdbaaaabb";
        String word2 = "aaaabbbccd";
        assertTrue(areClose.closeStrings(word1, word2));
    }

}