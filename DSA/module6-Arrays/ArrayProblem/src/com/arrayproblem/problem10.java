package com.arrayproblem;

//find the unique element
//LC 136
public class problem10 {
	
	//int result=0;
//	for(int i=0;i<arr.length;i++) {
//		result=result^arr[i];
//	}
	

	    public static int findUniqueElement(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            int count = 0;

	            // count frequency of arr[i]
	            for (int j = 0; j < arr.length; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                }
	            }
  
	            // if frequency is 1, return the unique element
	            if (count == 1) {
	                return arr[i];
	            }
	        }

	        return -1; // if no unique element found
	    }
	

	    public static void main(String[] args) {
	        int arr[] = {5, 1, 2, 1, 2, 5, 6};
	        System.out.println(findUniqueElement(arr)); // prints 6
	    }
	}


	
  
//time complexity-o(n)
//Aux space complexity-O(n);


