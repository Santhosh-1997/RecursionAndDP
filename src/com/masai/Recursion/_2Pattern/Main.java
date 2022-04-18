package com.masai.Recursion._2Pattern;

import java.util.ArrayList;
import java.util.List;

/*given the array and sum, find the subsequences whose sum is equal to given sum and print it but you have to print only the first subsequence and
not all*/

public class Main {

    public static boolean printSum(List<Integer> list, int n, int sum, int s, int index, int[] arr){

        //base case
        if(index == n){
            if(s == sum){
                System.out.println(list);
                return true;                        //it gives indication that one subsequence is found and it is printed and now go home
            }
            return false;
        }


        //recursive code

        s += arr[index];
        list.add(arr[index]);
        if(printSum(list,n,sum,s,index+1, arr))     //if it is true, that means we found one subsequence and time to go back to our home
            return true;

        s -= arr[index];
        list.remove(list.size()-1);

        if(printSum(list,n,sum,s,index+1,arr))      //if it is true, that means we found one subsequence and time to go back to our home
            return true;

        return false;
    }


    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,2,1};

        int sum = 2;

        ArrayList<Integer> list = new ArrayList<>();

        boolean result = printSum(list,n,sum,0,0, arr);
    }

}

/*Time Complexity is 2^n because for every element we have two choice either to be picked or not picked*/