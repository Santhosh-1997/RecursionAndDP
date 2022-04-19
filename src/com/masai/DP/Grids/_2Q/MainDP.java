package com.masai.DP.Grids._2Q;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainDP {

    public static int calculate(int i, int j, ArrayList<ArrayList<Integer>> mat, int[][] dp){

        //baseCase
        if(i == 0 && j == 0)        return 1;
        if(i<0 || j< 0)             return 0;
        if(mat.get(i).get(j) == -1) return 0;
        if(dp[i][j] != -1)          return dp[i][j];


        //recursiveCode

        int left = calculate(i, j-1, mat, dp);
        int top = calculate(i-1, j, mat, dp);

        dp[i][j] = left + top;

        return dp[i][j];
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

        for(int i=0; i<3; i++){
            ArrayList<Integer> test = new ArrayList<>();
            for(int j=0; j<3; j++){
                test.add(0);
            }
            mat.add(test);
        }

        mat.get(1).set(1,-1);

        int[][] dp = new int[mat.size()][mat.get(0).size()];
        for(int[] el : dp)
            Arrays.fill(el, -1);

        int result = calculate(mat.size()-1, mat.get(0).size()-1, mat, dp);

        System.out.println(result);
    }

}
