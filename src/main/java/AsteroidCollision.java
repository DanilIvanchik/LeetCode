import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {

    //Lvl: Medium

    //Runtime: 1ms
    //Beats 100.00% of users with Java

    //Memory: 44.00MB
    //Beats 53.14% of users with Java

    //TODO:We are given an array asteroids of integers representing asteroids in a row.
    // For each asteroid, the absolute value represents its size, and the sign represents
    // its direction (positive meaning right, negative meaning left). Each asteroid moves
    // at the same speed.
    // Find out the state of the asteroids after all collisions. If two asteroids meet,
    // the smaller one will explode. If both are the same size, both will explode. Two
    // asteroids moving in the same direction will never meet.

    public int[] asteroidCollision(int[] a) {
        int top = -1;
        for (int x : a) {
            boolean stillAlive = true;
            while (stillAlive && x < 0 && top >= 0 && a[top] > 0) {
                stillAlive = a[top] + x < 0;
                if (a[top] + x <= 0) top--;
            }
            if (stillAlive) a[++top] = x;
        }

        return Arrays.copyOf(a, top+1);
    }

}
