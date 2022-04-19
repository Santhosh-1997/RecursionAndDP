package com.masai.DP.Grids._2Q;

import java.util.ArrayList;

public class MainTab {

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

        for(int i=0; i<mat.size(); i++){

            for(int j=0; j<mat.get(0).size(); j++){

                if(i == 0 && j == 0)                 dp[i][j] = 1;
                else if(mat.get(i).get(j) == -1)     dp[i][j] = 0;
                else {
                    int left = 0;
                    int top = 0;

                    if (j > 0) left = dp[i][j - 1];
                    if (i > 0) top = dp[i - 1][j];

                    dp[i][j] = left + top;
                }
            }

        }

        System.out.println(dp[mat.size()-1][mat.get(0).size()-1]);
    }

}


//Time-Complexity---------> o(m*n)
//space-Complexiy           o(m*n)      (no recursive stack space)