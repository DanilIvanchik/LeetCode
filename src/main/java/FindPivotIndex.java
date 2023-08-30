public class FindPivotIndex {

    //Lvl: Easy

    //Runtime: 1ms
    //Beats 99.2% of users with Java

    //Memory: 44.14MB
    //Beats 57.19% of users with Java

    //TODO: Given an array of integers nums, calculate the pivot
    // index of this array. The pivot index is the index where the
    // sum of all the numbers strictly to the left of the index is
    // equal to the sum of all the numbers strictly to the index's
    // right. If the index is on the left edge of the array, then the
    // left sum is 0 because there are no elements to the left. This
    // also applies to the right edge of the array. Return the leftmost
    // pivot index. If no such index exists, return -1.

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int totalSum  = 0;

        for (int n: nums){
            totalSum+=n;
        }

        for(int i = 0; i < nums.length; i++){
            if (leftSum*2 == totalSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }

        return -1;
    }
}
