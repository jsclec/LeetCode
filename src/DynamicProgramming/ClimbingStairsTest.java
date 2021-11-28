package DynamicProgramming;

public class ClimbingStairsTest {
    public static void main(String[] args){
        int m = 2;
        int n = 8;
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int solution = climbingStairs.getNumberOfWaysExponentialRuntime(n+1,m);
        System.out.println("exponential: " + solution);
        System.out.println("O(n) time: " + climbingStairs.getNumberOfWaysSlidingWindow(n,m));
        System.out.println("top down: " + climbingStairs.topDownApproach(n));
    }
}
