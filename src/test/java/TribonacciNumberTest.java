import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class TribonacciNumberTest{

    @Test
    public void testTribonacciZero() {
        TribonacciNumber tribonacciNumber = new TribonacciNumber();
        int result = tribonacciNumber.tribonacci(0);
        assertEquals(0, result);
    }

    @Test
    public void testTribonacciOne() {
        TribonacciNumber tribonacciNumber = new TribonacciNumber();
        int result = tribonacciNumber.tribonacci(1);
        assertEquals(1, result);
    }

    @Test
    public void testTribonacciTwo() {
        TribonacciNumber tribonacciNumber = new TribonacciNumber();
        int result = tribonacciNumber.tribonacci(2);
        assertEquals(1, result);
    }

    @Test
    public void testTribonacciFive() {
        TribonacciNumber tribonacciNumber = new TribonacciNumber();
        int result = tribonacciNumber.tribonacci(5);
        assertEquals(7, result);
    }

    @Test
    public void testTribonacciTen() {
        TribonacciNumber tribonacciNumber = new TribonacciNumber();
        int result = tribonacciNumber.tribonacci(25);
        assertEquals(1389537, result);
    }
}