public class IncreasingTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {

        //Runtime: 2ms
        //Beats 93.81% of users with Java

        //Memory: 129MB
        //Beats 87.48% of users with Java

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
