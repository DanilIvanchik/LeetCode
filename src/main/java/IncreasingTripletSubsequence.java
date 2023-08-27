public class IncreasingTripletSubsequence {

    //Lvl: Medium

    //Runtime: 2ms
    //Beats 93.81% of users with Java

    //Memory: 129MB
    //Beats 87.48% of users with Java

    //TODO: Given an integer array nums, return true if there exists a
    // triple of indices (i, j, k) such that i < j < k and nums[i] <
    // nums[j] < nums[k]. If no such indices exists, return false.

    public boolean increasingTriplet(int[] nums) {

        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for(int n : nums) {
            if(n <= max1) max1 = n;
            else if(n <= max2) max2 = n;
            else return true;
        }
        return false;
    }
}
