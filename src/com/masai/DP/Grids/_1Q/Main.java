package com.masai.DP.Grids._1Q;

        /*You are present at point ‘A’ which is the top-left cell of an M X N matrix, your destination is point ‘B’,
        which is the bottom-right cell of the same matrix. Your task is to find the total number of unique paths from
        point ‘A’ to point ‘B’.In other words, you will be given the dimensions of the matrix as integers ‘M’ and ‘N’,
        your task is to find the total number of unique paths from the cell MATRIX[0][0] to MATRIX['M' - 1]['N' - 1].
        To traverse in the matrix, you can either move Right or Down at each step.
        For example in a given point MATRIX[i] [j], you can move to either MATRIX[i + 1][j] or MATRIX[i][j + 1].*/

/*https://www.codingninjas.com/codestudio/problems/total-unique-paths_1081470?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos*/

public class Main {

    //using recursion

    public static int calculate(int i, int j){

        //baseCase
        if(i == 0 && j == 0)    return 1;

        if(i<0 || j<0)          return 0;


        //recursiveCode

        int left = calculate(i-1,j);

        int top = calculate(i, j-1);

        return left + top;

    }

    public static void main(String[] args) {

        int[][] array = {{3,2},{1,6}};

        int path = calculate(array.length-1, array[0].length-1);

        System.out.println(path);
    }

}


//time complexity will be 2^(m*n)
//space complexity will be recursive stack space