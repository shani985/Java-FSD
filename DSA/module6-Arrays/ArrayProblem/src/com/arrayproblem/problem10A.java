package com.arrayproblem;

//find the unique element
//LC 136
public class problem10A {
	 public static int findUniqueElement(int[] arr) {
	int result=0;
	for(int i=0;i<arr.length;i++) {
		result=result^arr[i];
	}
	        return result; // if no unique element found
	    }
	

	    public static void main(String[] args) {
	        int arr[] = {5, 1, 2, 1, 2, 5, 6};
	        System.out.println(findUniqueElement(arr)); // prints 6
	    }
	}


	
  
//time complexity-o(n)
//Aux space complexity-O(n);


