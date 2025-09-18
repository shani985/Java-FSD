package com.arrayproblem;

import java.util.Arrays;

//find the duplicate number 
//LC 287
//using sorting 

public class problem9A {
	public static int findDuplicate(int []arr  ) {
			Arrays.sort(arr);
			int n=arr.length;
			for(int i=0;i<n-1;i++) {
					if(arr[i]==arr[i+1]) {
						return arr[i];
					
				}
			}
			return -1;
			
		}
		
		
	

	public static void main(String[] args) {
	int arr[]= {10,20,3,40,57,100};
	System.out.println(findDuplicate(arr));
	  
	}

}
//time complexity-o(nlogn)
//Aux space complexity-O(n);


