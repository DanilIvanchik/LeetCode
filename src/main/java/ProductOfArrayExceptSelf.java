import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    //Runtime: 1ms
    //Beats 100.00%of users with Java

    //Memory: 52.83MB
    //Beats 55.93%of users with Java

    public int[] productExceptSelf(int[] nums) {

        if (nums.length ==1){
            return nums;
        }

        int n = nums.length;
        int mult = 1;
        int[] ans = new int[n];
        for(int i = 0; i<n; i++){
            ans[i] = mult;
            mult*=nums[i];
        }

        mult = 1;
        for(int j = n-1; j>=0; j--){
            ans[j]*=mult;
            mult*=nums[j];
        }
        return ans;

    }
}
