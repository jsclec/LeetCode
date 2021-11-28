package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinCostClimbingStairs {
    /**
     * You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
     *
     * You can either start from the step with index 0, or the step with index 1.
     *
     * Return the minimum cost to reach the top of the floor.
     */
    public int minCost(int[] cost){
        //this is very similar to the previous greedy problem house robber
        int[] costs = new int[cost.length];

        costs[0] = cost[0];
        costs[1] = Math.min(costs[0] + cost[1], cost[1]);

        for(int i = 2; i<cost.length;i++){
            costs[i] = Math.min(costs[i-1] + cost[i], costs[i-2] + cost[i]);
        }
        System.out.println(Arrays.toString(costs));
        return costs[cost.length-1];
    }
}
