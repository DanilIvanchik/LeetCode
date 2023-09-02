import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AsteroidCollisionTest {
    AsteroidCollision collision = new AsteroidCollision();

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] result = collision.asteroidCollision(input);
        int[] expected = {};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testNoCollisions() {
        int[] input = {1, 2, 3};
        int[] result = collision.asteroidCollision(input);
        int[] expected = {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testPositiveAndNegativeAsteroids() {
        int[] input = {5, 10, -5};
        int[] result = collision.asteroidCollision(input);
        int[] expected = {5, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testMultipleCollisions() {
        int[] input = {8, -8, 5, 10, -5};
        int[] result = collision.asteroidCollision(input);
        int[] expected = {5, 10};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testZeroArray() {
        int[] input = {0, 0, 0};
        int[] result = collision.asteroidCollision(input);
        int[] expected = {0, 0, 0};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testInDifferentDirections() {
        int[] input = {-8, 8};
        int[] result = collision.asteroidCollision(input);
        int[] expected = {-8, 8};
        Assert.assertArrayEquals(expected, result);
    }

}