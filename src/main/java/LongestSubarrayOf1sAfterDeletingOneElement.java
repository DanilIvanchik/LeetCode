public class LongestSubarrayOf1sAfterDeletingOneElement {

    //Lvl: Medium

    //Runtime: 2ms
    //Beats 86.6% of users with Java

    //Memory: 55.79MB
    //Beats 21.26% of users with Java

    //TODO:Given a binary array nums, you should delete one element from it.
    // Return the size of the longest non-empty subarray containing only 1's
    // in the resulting array. Return 0 if there is no such subarray.

    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int left = 0;
        int zeros = 0;
        int max = 0;

        if (nums.length == 0){
            return 0;
        }

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            max = Math.max(max, right - left);
        }
        return (max == n) ? max - 1 : max;
    }
}
