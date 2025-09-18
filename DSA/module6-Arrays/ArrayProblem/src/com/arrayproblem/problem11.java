package com.arrayproblem;
import java.util.Arrays; 
//find the messing element 
//LC 268
public class problem11 {
	public static int findMissingElement(int[] arr) {
	    Arrays.sort(arr);
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != i) {
	            return i;  // missing number found
	        }
	    }
	    return arr.length; // if none missing, then missing = n
	}


	    public static void main(String[] args) {
	        int arr[] = {9,6,4,2,3,5,7,0,1};
	        System.out.println(findMissingElement(arr)); // prints 6
	    }
	}


	
   
//time complexity-o(n)
//Aux space complexity-O(n);


