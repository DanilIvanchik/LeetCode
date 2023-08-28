import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest{

    private final MaximumNumberOfVowelsInASubstringOfGivenLength maxVowels = new MaximumNumberOfVowelsInASubstringOfGivenLength();

    @Test
    public void testMaxVowelsWithShortString() {
        String s = "hello";
        int k = 2;
        assertEquals(1, maxVowels.maxVowels(s, k));

        Map<String, String> d = new HashMap<>();
        List<String> ss = new ArrayList<>();
        ss.forEach(System.out::println);
;    }

    @Test
    public void testMaxVowelsWithLongString() {
        String s = "kacmkmsakmceomfijfvpodcmklwencmdlkmcl";
        int k = 3;
        assertEquals(2, maxVowels.maxVowels(s, k));
    }

    @Test
    public void testMaxVowelsWithAllVowels() {
        String s = "aeiou";
        int k = 3;
        assertEquals(3, maxVowels.maxVowels(s, k));
    }

    @Test
    public void testMaxVowelsWithNoVowels() {
        String s = "hmm";
        int k = 2;
        assertEquals(0, maxVowels.maxVowels(s, k));
    }

    @Test
    public void testMaxVowelsEmptyString() {
        String s = "";
        int k = 0;
        assertEquals(0, maxVowels.maxVowels(s, k));
    }

    @Test
    public void testMaxVowelsGapString() {
        String s = "                            ";
        int k = 0;
        assertEquals(0, maxVowels.maxVowels(s, k));
    }

}