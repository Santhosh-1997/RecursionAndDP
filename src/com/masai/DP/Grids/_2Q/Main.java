package com.masai.DP.Grids._2Q;

import java.util.ArrayList;

        /*Given a ‘N’ * ’M’ maze with obstacles, count and return the number of paths to reach the right-bottom cell
        from the top-left cell. A cell in the given maze has a value -1 if it is a blockage or dead-end, else 0.
        From a given cell, we are allowed to move to cells (i+1, j) and (i, j+1) only.
        Since the answer can be large, print it modulo 10^9 + 7.*/

        /*https://www.codingninjas.com/codestudio/problems/maze-obstacles_977241?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos*/


public class Main {

    public static int calculate(int i, int j, ArrayList<ArrayList<Integer>> mat){

        //baseCase
        if(i == 0 & j == 0)             return 1;
        if(i<0 || j<0)                  return 0;
        if(mat.get(i).get(j) == -1)     return 0;


        //RecursiveCode

        int left = calculate(i, j-1, mat);
        int top = calculate(i-1, j, mat);

        return left + top;
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

        int result = calculate(mat.size()-1, mat.get(0).size()-1, mat);

        System.out.println(result);

    }

}
