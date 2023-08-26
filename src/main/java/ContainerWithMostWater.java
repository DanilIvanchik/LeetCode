public class ContainerWithMostWater {

    //Lvl: Medium

    //Runtime: 4ms
    //Beats 84.04% of users with Java

    //Memory: 55.09MB
    //Beats 97.90% of users with Java

    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (right > left){
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, currentArea);

            if (height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }

        return max;
    }
}
