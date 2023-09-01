import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class RemovingStarsFromAStringTest{

    private final  RemovingStarsFromAString removeStars = new RemovingStarsFromAString();

    @Test
    public void testRemoveStarsWithNoStars() {
        String input = "Hello, World!";
        String result = removeStars.removeStars(input);
        assertEquals(input, result);
    }

    @Test
    public void testRemoveStarsWithStarsInside() {
        String input = "Th*is is a *test* string";
        String result = removeStars.removeStars(input);
        assertEquals("Tis is ates string", result);
    }

    @Test
    public void testRemoveStarsWithStarsAtBothEnds() {
        String input = "*Test*";
        String result = removeStars.removeStars(input);
        assertEquals("Tes", result);
    }

    @Test
    public void testRemoveStarsWithConsecutiveStars() {
        String input = "A*B*C*D*E";
        String result = removeStars.removeStars(input);
        assertEquals("E", result);
    }

    @Test
    public void testRemoveStarsWithEmptyString() {
        String input = "";
        String result = removeStars.removeStars(input);
        assertEquals("", result);
    }

}