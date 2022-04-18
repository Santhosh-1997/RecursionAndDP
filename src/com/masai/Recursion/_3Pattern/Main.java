package com.masai.Recursion._3Pattern;

import java.util.ArrayList;
import java.util.List;

/*Count the number of subsequences whose sum is equal to given sum*/

public class Main {

    public static int printSum(List<Integer> list,int n, int sum, int s, int index, int[] arr){

        //basecase
        if(index == n){
            if(sum == s)
                return 1;

            return 0;
        }

        //recursiveCode
        list.add(arr[index]);
        s += arr[index];

        int pick = printSum(list, n, sum, s,index+1, arr);

        s -= arr[index];
        list.remove(list.size()-1);

        int notPick = printSum(list,n,sum,s,index+1,arr);

        return pick + notPick;

    }

    public static void main(String[] args) {
	// write your code here

        int n = 3;
        int[] arr = {1,2,1};

        int sum = 2;

        ArrayList<Integer> list = new ArrayList<>();

        int count = printSum(list,n,sum,0,0, arr);

        System.out.println(count);
    }
}


/*Time Complexity is 2^n because for every element we have two choice either to be picked or not picked*/
