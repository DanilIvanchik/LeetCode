
public class SingleNumber {

    //Lvl: Easy

    //Runtime: 1ms
    //Beats 99.97% of users with Java

    //Memory: 44.18MB
    //Beats 80.89% of users with Java

    //TODO: Given a non-empty array of integers nums, every element
    // appears twice except for one. Find that single one.
    // You must implement a solution with a linear runtime complexity
    // and use only constant extra space.

    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }
}
