public class ContainerWithMostWater {

    //Lvl: Medium

    //Runtime: 4ms
    //Beats 84.04% of users with Java

    //Memory: 55.09MB
    //Beats 97.90% of users with Java

    //TODO:You are given an integer array height of length n. There are n vertical lines
    // drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
    // Find two lines that together with the x-axis form a container, such that the container
    // contains the most water. Return the maximum amount of water a container can store.
    // Notice that you may not slant the container.

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
