package com.arrayproblem;

//contain duplicate element
//LC 217

public class problem8 {
	public static boolean containsDuplicate(int []arr  ) {
			
			int n=arr.length;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						return true;
					}
				}
			}
			return false;
			
		}
		
		
	

	public static void main(String[] args) {
	int arr[]= {10,20,3,40,57,10};
	System.out.println(containsDuplicate(arr));
	  
	}

}
//time complexity-o(n2)
//Aux space complexity-O(1);