package com.masai.DP.Grids._3Q;

public class MainSpaceOpt {

    public static void main(String[] args) {
        int[][] array = {{1}, {2, 3}, {3, 6, 7}, {8, 9, 6, 10}};

        /*
        1
        2 3
        3 6 7
        8 9 6 10  */

        int[] base = new int[array.length];

        for (int i = array[array.length - 1].length - 1; i >= 0; i--) {
            base[i] = array[array.length - 1][i];           //whatSoEver the last row element will be same in the last row of dp as well
        }

        int[] current = new int[array.length];

        for (int i = array[array.length - 2].length - 1; i >= 0; i--) {

            for (int j = i; j >= 0; j--) {

                int down = array[i][j] + base[j];

                int downRight = array[i][j] + base[j + 1];

                current[j] = Math.min(down, downRight);
            }

            for(int j=0; j<base.length; j++){
                base[j] = current[j];
            }
        }

        System.out.println(base[0]);

    }
}

//space complexity is o(N);