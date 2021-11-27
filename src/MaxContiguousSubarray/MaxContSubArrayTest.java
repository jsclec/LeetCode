package MaxContiguousSubarray;

public class MaxContSubArrayTest {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        MaxContSubArrayImpl maxContSubArray = new MaxContSubArrayImpl();
        System.out.println("my answer: " + maxContSubArray.maxSubArray(nums));
        System.out.println("the right answer: 6");
    }

}
