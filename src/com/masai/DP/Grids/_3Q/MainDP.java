package com.masai.DP.Grids._3Q;

import java.util.Arrays;

public class MainDP {
    public static int minSum(int i, int j, int[][] array, int[][] dp){

        //baseCase
        if(i == array.length-1)      return array[i][j];

        if(dp[i][j] != -1)          return dp[i][j];


        //recursiveCode

        int down = array[i][j] + minSum(i+1, j, array, dp);

        int downRight = array[i][j] + minSum(i+1, j+1, array, dp);

        dp[i][j] = Math.min(down, downRight);

        return dp[i][j];

    }
    public static void main(String[] args) {
        int[][] array = { {1}, {2, 3}, {3, 6, 7}, {8, 9, 6, 10}};

        /*
        1
        2 3
        3 6 7
        8 9 6 10  */

        int[][] dp = new int[array.length][];

        for(int i=0; i<dp.length; i++){
            dp[i] = new int[i+1];
        }

        for(int[] el : dp)
            Arrays.fill(el, -1);

        int result = minSum(0, 0, array, dp);

        System.out.println(result);
    }

}

/*
Time Complexity will become o(n*n)
Space Complexity will be o(n)
*/
