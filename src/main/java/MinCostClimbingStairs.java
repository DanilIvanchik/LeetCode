public class MinCostClimbingStairs {

    //Lvl: Medium

    //Runtime: 0ms
    //Beats 100.00% of users with Java

    //Memory: 42.9MB
    //Beats 73.90% of users with Java

    //TODO:You are given an integer array cost where cost[i] is the cost of ith
    // step on a staircase. Once you pay the cost, you can either climb one or
    // two steps.
    // You can either start from the step with index 0, or the step with index 1.
    // Return the minimum cost to reach the top of the floor.

    public int minCostClimbingStairs(int[] cost) {

        int n  = cost.length;

        if (n == 2){
            return Math.min(cost[0], cost[1]);
        }

        int count = 0;

        for (int i  = 0; i < n-2; i++){
            if (cost[i] < cost[i+1] && cost[i+1] < cost[i+2]){
                count+=cost[i+1];
                i++;
            }else if(cost[i] < cost[i+1] && cost[i+1] > cost[i+2]){
                count+=cost[i];
                i++;
            }else{
                count+=cost[i];
            }
        }
        return count;

    }
}
