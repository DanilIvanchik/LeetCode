import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {

        Arrays.sort(nums);
        int pointOne = 0;
        int pointTwo = nums.length - 1;
        int count = 0;

        while (pointOne < pointTwo){
            int sum = nums[pointOne] + nums[pointTwo];
            if (sum == k) {
                nums[pointOne] = 0;
                nums[pointTwo] = 0;
                count++;
                pointTwo--;
                pointOne++;
            }else if(sum > k){
                pointTwo--;
            }else{
                pointOne++;
            }
        }
        return count;
    }
}
