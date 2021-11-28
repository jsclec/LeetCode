package DynamicProgramming;

public class MinCostClimbingStairsTest {

    public static void main(String[] args){
        int[] costs = {1,100,1,1,1,100,1,1,100,1};
        MinCostClimbingStairs minCostClimbingStairs = new MinCostClimbingStairs();
        System.out.println(minCostClimbingStairs.minCost(costs));
    }
}
