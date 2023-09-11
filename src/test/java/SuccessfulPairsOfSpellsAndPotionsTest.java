import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class SuccessfulPairsOfSpellsAndPotionsTest{

    @Test
    public void testSuccessfulPairs_Example1() {
        SuccessfulPairsOfSpellsAndPotions solution = new SuccessfulPairsOfSpellsAndPotions();
        int[] spells = {2, 4, 6};
        int[] potions = {1, 2, 3, 4, 5};
        long success = 6;
        int[] expected = {3, 4, 5};
        int[] result = solution.successfulPairs(spells, potions, success);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSuccessfulPairs_Example2() {
        SuccessfulPairsOfSpellsAndPotions solution = new SuccessfulPairsOfSpellsAndPotions();
        int[] spells = {3, 7, 10};
        int[] potions = {1, 2, 4, 5, 8};
        long success = 15;
        int[] expected = {2, 3, 4};
        int[] result = solution.successfulPairs(spells, potions, success);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSuccessfulPairs_EmptyInput() {
        SuccessfulPairsOfSpellsAndPotions solution = new SuccessfulPairsOfSpellsAndPotions();
        int[] spells = {};
        int[] potions = {};
        long success = 6;
        int[] expected = {};
        int[] result = solution.successfulPairs(spells, potions, success);
        assertArrayEquals(expected, result);
    }

}