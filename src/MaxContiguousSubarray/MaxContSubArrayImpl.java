package MaxContiguousSubarray;

import java.util.Arrays;

class MaxContSubArrayImpl{
    public int maxSubArray(int[] nums) {
        int sum=0;
        int runningSum = 0;
        for(int i : nums){
            runningSum += i;
            if(runningSum < 0)
                runningSum = 0;
            else
                sum  = Math.max(sum, runningSum);
        }
        if(sum == 0){
            Arrays.sort(nums);
            return nums[nums.length - 1];
        }
        return sum;
    }
}
