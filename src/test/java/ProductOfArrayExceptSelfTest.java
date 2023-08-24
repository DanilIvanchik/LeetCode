import junit.framework.TestCase;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {

    @Test
    public void ProductOfArrayExceptSelfStandartTest(){
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        assertArrayEquals(new int[] {24,12,8,6},product.productExceptSelf(new int[]{1,2,3,4}));
    }

    @Test
    public void ProductOfArrayExceptSelfBigLengthTest(){
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        int[] intArr = new int[100000];
        for (int i = 0; i < intArr.length; i++){
            intArr[i] = 1;
        }
        assertArrayEquals(intArr,product.productExceptSelf(intArr));
    }

    @Test
    public void ProductOfArrayExceptSelfEmptyTest(){
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        assertArrayEquals(new int[0],product.productExceptSelf(new int[0]));
    }

    @Test
    public void ProductOfArrayExceptSelfOneLengthTest(){
        ProductOfArrayExceptSelf product = new ProductOfArrayExceptSelf();
        assertArrayEquals(new int[1],product.productExceptSelf(new int[1]));
    }



}