package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HouseRobber {

    /** You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping
     *  you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses
     *  were broken into on the same night.
     * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
    */

    //variation on this problem: you can only rob up to k houses
    //state variables for this problem: i, the index of the house that you are currently at

    public int robSomeHouses(int[] nums){
        // at every house there are two scenarios, either we robbed the previous house and therefore
        // we cannot rob the current house, so the money so far is robSomeHouses(i-1),
        // or two, we robbed the house two houses ago and can decide to rob the current house, or not, so
        // therefore we leave with nums[i] + dp(i-2)
        // therefore we have our recurrence relation: dp[i] = max(dp[i-1], dp[i-2] + nums[i])


        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2;i<nums.length; i++){
            dp[i] = Math.max(dp[i-1], nums[i] + dp[i-2]);
        }

        System.out.println(Arrays.toString(dp));
        return dp[nums.length-1];
     }



}
