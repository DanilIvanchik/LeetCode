import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class IncreasingTripletSubsequenceTest {

    @Test
    public void IncreasingTripletSubsequenceTestTrue(){
        IncreasingTripletSubsequence subsequence = new IncreasingTripletSubsequence();
        assertTrue(subsequence.increasingTriplet(new int[]{1,2,3,4,5}));
    }

    @Test
    public void IncreasingTripletSubsequenceTestFalse(){
        IncreasingTripletSubsequence subsequence = new IncreasingTripletSubsequence();
        assertFalse(subsequence.increasingTriplet(new int[]{6,9,7}));
    }

}