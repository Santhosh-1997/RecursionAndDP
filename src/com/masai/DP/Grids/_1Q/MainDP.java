package com.masai.DP.Grids._1Q;

import java.util.Arrays;

public class MainDP {

    //using dp (Memoization)

    public static int calculate(int i, int j, int[][] dp){

        if(i == 0 && j == 0)    return 1;
        if(i<0 || j<0)          return 0;

        if(dp[i][j] != -1)      return dp[i][j];

        int left = calculate(i-1, j, dp);

        int top = calculate(i, j-1, dp);

        dp[i][j] = left + top;

        return dp[i][j];
    }


    public static void main(String[] args) {

        int[][] array = {{3,2},{1,6}};

        int[][] dp = new int[array.length][array[0].length];        //declaring dp of array of size mXn

        for(int[] el : dp)
            Arrays.fill(el,-1);

        int path = calculate(array.length-1, array[0].length-1, dp);

        System.out.println(path);

    }

}
