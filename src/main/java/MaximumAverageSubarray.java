import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class MaximumAverageSubarray {

    //Lvl: Easy

    //Runtime: 2ms
    //Beats 100% of users with Java

    //Memory: 54.00MB
    //Beats 97.09% of users with Java

    //TODO: You are given an integer array nums consisting of n elements, and an integer k.
    // Find a contiguous subarray whose length is equal to k that has the maximum average
    // value and return this value. Any answer with a calculation error less than 10-5 will
    // be accepted.

    public static double findMaxAverage(int[] nums, int k) {

        if (nums.length < k){
            return 0;
        }

        int sum = 0;
        for (int i =0; i < k; i++){
            sum +=  nums[i];
        }
        int i = 0;
        int j = k;
        double average = sum/(double) k;
        while (j < nums.length){
            sum+=nums[j];
            sum-=nums[i];
            double newAvg = sum/(double) k;
            if (newAvg > average){
                average = newAvg;
            }
            i++;
            j++;
        }
        return average;
    }
}
