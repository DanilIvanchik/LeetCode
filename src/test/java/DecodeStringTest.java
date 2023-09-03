import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecodeStringTest{
    private final DecodeString decodeString = new DecodeString();

    @Test
    public void testDecodeStringBasic() {
        String input = "3[a]2[bc]";
        String expected = "aaabcbc";
        assertEquals(expected, decodeString.decodeString(input));
    }

    @Test
    public void testDecodeStringNested() {
        String input = "2[abc3[cd]]xyz";
        String expected = "abccdcdcdabccdcdcdxyz";
        assertEquals(expected, decodeString.decodeString(input));
    }

    @Test
    public void testDecodeStringEmptyInput() {
        String input = "";
        String expected = "";
        assertEquals(expected, decodeString.decodeString(input));
    }

    @Test
    public void testDecodeStringNoRepeats() {
        String input = "abcd";
        String expected = "abcd";
        assertEquals(expected, decodeString.decodeString(input));
    }

}