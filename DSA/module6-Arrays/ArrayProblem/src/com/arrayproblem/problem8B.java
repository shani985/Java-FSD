package com.arrayproblem;


import java.util.HashSet;
//contain duplicate element
//LC 217
//using Hashset  

public class problem8B {
	public static boolean containsDuplicate(int []arr  ) {
			
			HashSet<Integer> myset=new HashSet<>();
			int n=arr.length;
			for(int i=0;i<n;i++) {
				if(myset.contains(arr[i])) {
					return true; 
				}
				myset.add(arr[i]);
			}
			return false;
			
		}
		 
		
	

	public static void main(String[] args) {
	int arr[]= {100,1,3,40,7,1};
	System.out.println(containsDuplicate(arr));
	  
	}

}
//time complexity-o(n )
//Aux space complexity-O(n);
 