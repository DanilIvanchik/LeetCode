import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringCompressionTest{

    @Test
    public void StringCompressionTestStrings(){
        StringCompression stringCompression = new StringCompression();
        assertEquals(4, stringCompression.compress(new char[]{'1','2','2'}));
    }


    @Test
    public void StringCompressionTestNotEquals(){
        StringCompression stringCompression = new StringCompression();
        assertNotEquals(2, stringCompression.compress(new char[]{'1','2','2'}));
    }

    @Test
    public void StringCompressionTestEqualsWithGap(){
        StringCompression stringCompression = new StringCompression();
        assertNotEquals(6, stringCompression.compress(new char[]{'1','2','2',' '}));
    }

    @Test
    public void StringCompressionTestEqualsWithChars(){
        StringCompression stringCompression = new StringCompression();
        assertEquals(6, stringCompression.compress(new char[]{'a','a','b','b','c','c','c','c'}));
    }



}