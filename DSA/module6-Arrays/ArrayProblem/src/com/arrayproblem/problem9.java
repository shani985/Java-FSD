package com.arrayproblem;

//find the duplicate number 
//LC 287
//Brute force technique  

public class problem9 {
	public static int findDuplicate(int []arr  ) {
			
			int n=arr.length;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						return arr[i];
					}
				}
			}
			return -1;
			
		}
		
		
	

	public static void main(String[] args) {
	int arr[]= {10,20,3,40,57,100};
	System.out.println(findDuplicate(arr));
	  
	}

}
//time complexity-o(n2)
//Aux space complexity-O(1);
