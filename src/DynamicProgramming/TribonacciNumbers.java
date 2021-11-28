package DynamicProgramming;

import java.util.HashMap;

public class TribonacciNumbers {
    public int getTheNthTribonacciNumber(int n){
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        for(int i = 3;i<=n;i++){
            nums[i] = nums[i-3] + nums[i-2] + nums[i-1];
        }

        return nums[n];
    }
}
