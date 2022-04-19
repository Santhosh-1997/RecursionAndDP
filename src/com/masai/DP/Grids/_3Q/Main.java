package com.masai.DP.Grids._3Q;

       /* You are given a triangular array/list 'TRIANGLE'. Your task is to return the minimum path sum to reach from the top to the bottom row.
        The triangle array will have N rows and the i-th row, where 0 <= i < N will have i + 1 elements.
        You can move only to the adjacent number of row below each step.
        For example, if you are at index j in row i, then you can move to i or i + 1 index in row j + 1 in each step.*/

    /*https://www.codingninjas.com/codestudio/problems/triangle_1229398?source=youtube&campaign=striver_dp_videos&utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_dp_videos*/

public class Main {

    public static int minSum(int i, int j, int[][] array){

        //baseCase
        if(i == array.length-1)     return array[array.length-1][j];


        //recursiveCode

        int down = array[i][j] + minSum(i+1, j, array);

        int downRight = array[i][j] + minSum(i+1, j+1, array);

        return Math.min(down, downRight);

    }

    public static void main(String[] args) {

        int[][] array = { {1}, {2, 3}, {3, 6, 7}, {8, 9, 6, 10}};

        /*
        1
        2 3
        3 6 7
        8 9 6 10  */

        int result = minSum(0, 0, array);

        System.out.println(result);
    }
}

/*
Time Complexity is O(2^(sum of rows))  i.e o(2^(0+1+2+...n))
Space Complexity is Recursive Stack Space O(N)
*/
