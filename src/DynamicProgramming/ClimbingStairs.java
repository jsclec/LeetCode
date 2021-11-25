package DynamicProgramming;

import java.util.Arrays;

public class ClimbingStairs {

    public static int getNumberOfWaysExponentialRuntime(int n, int m){
        //create an array that can hold the number of ways to each step
        int[] res = new int[n];

        //initialize the base cases
        res[0]=1;
        res[1] = 1;

        //now loop through all the steps, adding all the ways
        //recurrence relation is simply res[i] = res[i-1]+res[i-2]+..res[i-m]
        for(int i = 2;i<n;i++){
            res[i]=0;
            for(int j = 1;j<=m && j<=i;j++){
                res[i] += res[i-j];
            }
            System.out.println(Arrays.toString(res));
        }
        return res[n-1];

    }

    public static int getNumberOfWaysSlidingWindow(int n, int m){
        int[] res = new int[n+1];
        //keep a window of sum of last m possible stairs from which we can climb to the ith stair
        res[0] = 1;
        int temp = 0;
        for(int i = 1;i<=n;i++){
            int s = i - m - 1;
            int e = i - 1;
            if(s>=0){
               temp -= res[s];
            }
            temp += res[e];
            res[i] = temp;
        }
        return res[n];
    }

    public static void main(String[] args){
        int m = 2;
        int n = 8;
        int solution = getNumberOfWaysExponentialRuntime(n+1,m);
        System.out.println("exponential: " + solution);
        System.out.println("O(n) time: " + getNumberOfWaysSlidingWindow(n,m));
    }
}
