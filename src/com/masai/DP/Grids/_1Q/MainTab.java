package com.masai.DP.Grids._1Q;

import java.util.Arrays;

public class MainTab {

    public static void main(String[] args) {

        int[][] array = {{3,2},{1,6}};

        int m = array.length;
        int n = array[0].length;

        int[][] dp = new int[array.length][array[0].length];        //declaring dp of array of size mXn

        for(int i=0; i<m; i++){

            for(int j=0; j<n; j++){

                if(i == 0 && j == 0)
                    dp[i][j] = 1;
                else{
                    int left = 0;
                    int up = 0;


                    if(i>0)     up = dp[i-1][j];
                    if(j>0)     left = dp[i][j-1];

                    dp[i][j] = left + up;
                }

            }

        }

        System.out.println(dp[m-1][n-1]);

    }

}


//time com is O(m*n)
//space com is o(m*n)