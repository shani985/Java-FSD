package com.arrayproblem;
import java.util.HashSet; 
//find the messing element 
//LC 268
public class problem11A {
	 public static int findMessingElement(int[] arr) {
		HashSet<Integer>myset=new HashSet<>();
		for(int x:arr) {
			myset.add(x);
		}
		for(int i=0;i<arr.length+1;i++) {
			if(!myset.contains(i)) {
				return i;
			}
		}
	        return -1; 
	    }
	

	    public static void main(String[] args) {
	        int arr[] = {9,6,4,2,3,5,7,0,1};
	        System.out.println(findMessingElement(arr)); // prints 6
	    }
	}


	
   
//time complexity-o(n)
//Aux space complexity-O(n);


