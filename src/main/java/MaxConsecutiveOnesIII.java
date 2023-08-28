public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int max = 0;
        while (j < n){
            if (nums[j] == 1){
                j++;
            }else if(nums[j] == 0 && k > 0){
                k--;
                j++;
            }else{
                max = Math.max(max, j - i);
                if(nums[i] == 0){
                    k++;
                }
                i++;
            }
        }
        return Math.max(j-i, max);
    }
}
