public class MoveZeroes {

    //Lvl: Easy

    //Runtime: 1ms
    //Beats 100% of users with Java

    //Memory: 45.6MB
    //Beats 5.39% of users with Java

    //TODO: Given an integer array nums, move all 0's to the end of it while
    // maintaining the relative order of the non-zero elements. Note that you
    // must do this in-place without making a copy of the array.

    public void moveZeroes(int[] nums) {
        int i =0;

        for (int n: nums){
            if (n != 0){
                nums[i] = n;
                i++;
            }
        }
        while (i < nums.length){
            nums[i]  = 0;
            i++;
        }
    }
}
