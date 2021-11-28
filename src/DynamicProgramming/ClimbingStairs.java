package DynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class ClimbingStairs {

    //don't necessarily need a hashmap, could use an array for top down, but get used to using hashmaps for dp
    private HashMap<Integer, Integer> hm = new HashMap<>();

    public int getNumberOfWaysExponentialRuntime(int n, int m){
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

    public int getNumberOfWaysSlidingWindow(int n, int m){
        int[] res = new int[n+1];
        //keep a window of sum of last m possible stairs from which we can climb to the ith stair
        res[0] = 1;
        int temp = 0;
        for(int i = 1;i<=n;i++){//assume that i=5, m=2
            int s = i - m - 1;//2
            int e = i - 1;//4
            if(s>=0){
               temp -= res[s];//temp = 5-2 = 3
            }
            temp += res[e];//temp = 3 + 5 = 8
            res[i] = temp;//res = [1,1,2,3,5,8...
        }
        return res[n];
    }

    public int topDownApproach(int n){
        //very straight forward to implement
        if(n <= 2) return n;
        if(!hm.containsKey(n)){
            hm.put(n, topDownApproach(n-1) + topDownApproach(n-2));
        }

        return hm.get(n);

    }


}
