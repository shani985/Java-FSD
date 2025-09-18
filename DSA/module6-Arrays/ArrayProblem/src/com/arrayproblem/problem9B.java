package com.arrayproblem;

import java.util.HashSet;

//find the duplicate number 
//LC 287
//using sorting 



public class problem9B {
    public static int findDuplicate(int []arr) {
        HashSet<Integer> myset = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i < n; i++) {   // check all elements
            if(myset.contains(arr[i])) {
                return arr[i]; // duplicate found
            }
            myset.add(arr[i]);
        }
        return -1; // no duplicate
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 3, 40, 57, 10};
        System.out.println(findDuplicate(arr)); // prints -1 (no duplicate)
    }
}




//time complexity-o(n)
//Aux space complexity-O(n);


