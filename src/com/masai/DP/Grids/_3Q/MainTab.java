package com.masai.DP.Grids._3Q;

public class MainTab {

    public static void main(String[] args) {
        int[][] array = { {1}, {2, 3}, {3, 6, 7}, {8, 9, 6, 10}};

        /*
        1
        2 3
        3 6 7
        8 9 6 10  */

        int[][] dp = new int[array.length][array.length];

        for(int i = array[array.length-1].length-1; i>=0; i--){
            dp[array.length-1][i] = array[array.length-1][i];           //whatSoEver the last row element will be same in the last row of dp as well
        }

        for(int i = array[array.length-2].length-1; i>=0; i--){

            for(int j = i; j>=0; j--){

                int down = array[i][j] + dp[i+1][j];

                int downRight = array[i][j] + dp[i+1][j+1];

                dp[i][j] = Math.min(down, downRight);

            }

        }



        System.out.println(dp[0][0]);
    }

}
