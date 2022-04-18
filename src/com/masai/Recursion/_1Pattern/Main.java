package com.masai.Recursion._1Pattern;

import java.util.ArrayList;
import java.util.List;

/*given the array and sum, find the subsequences whose sum is equal to given sum and print it*/

public class Main {

    public static void printSum(List<Integer> list, int n, int sum, int s, int index, int[] arr){

        //base case

        if(index == n){
            if(sum == s){
                System.out.println(list);
            }
            return;
        }

        //recursive code

        //pick
        list.add(arr[index]);
        s += arr[index];
        printSum(list,n,sum,s,index+1,arr);

        s -= arr[index];
        list.remove(list.size()-1);

        //notPick
        printSum(list,n,sum,s,index+1,arr);

        return ;
    }


    public static void main(String[] args) {

        int n = 3;
        int[] arr = {1,2,1};

        int sum = 2;

        ArrayList<Integer> list = new ArrayList<>();

        printSum(list,n,sum,0,0, arr);

    }

}

/*Time Complexity is 2^n because for every element we have two choice either to be picked or not picked*/