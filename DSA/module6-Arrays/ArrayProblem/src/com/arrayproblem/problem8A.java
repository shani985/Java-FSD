package com.arrayproblem;

import java.util.Arrays;

//contain duplicate element
//LC 217
//using sort
public class problem8A {
	public static boolean containsDuplicate(int []arr  ) {
			
			Arrays.sort(arr);
			int n=arr.length;
			for(int i=0;i<n-1;i++) {
				if(arr[i]==arr[i+1]) {
					return true;
				}
			}
			return false;
			
		}
		
		
	

	public static void main(String[] args) {
	int arr[]= {100,1,3,40,7,10};
	System.out.println(containsDuplicate(arr));
	  
	}

}
//time complexity-o(nlogn)
//Aux space complexity-O(n);