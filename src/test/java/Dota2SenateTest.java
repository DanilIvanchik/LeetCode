import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class Dota2SenateTest{

    private final Dota2Senate dota2Senate = new Dota2Senate();

    @Test
    public void testPredictPartyVictoryRadiantWins() {
        String senate = "RDD";
        String expected = "Dire";
        assertEquals(expected, dota2Senate.predictPartyVictory(senate));
    }

    @Test
    public void testPredictPartyVictoryDireWins() {
        String senate = "DDRR";
        String expected = "Dire";
        assertEquals(expected, dota2Senate.predictPartyVictory(senate));
    }

    @Test
    public void testPredictPartyVictoryRadiantWinsWithLongerInput() {
        String senate = "DDRRDDRRRR";
        String expected = "Dire";
        assertEquals(expected, dota2Senate.predictPartyVictory(senate));
    }

    @Test
    public void testPredictPartyVictoryDireWinsWithLongerInput() {
        String senate = "RRDDRRDDDD";
        String expected = "Radiant";
        assertEquals(expected, dota2Senate.predictPartyVictory(senate));
    }
}