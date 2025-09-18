package com.arrayproblem;
import java.util.*;
//reverse  the array 
//problem should be solve with content space
// two pointer technique
//
public class problem3 {
	public static void reverseArray(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end --;
		}
		
		
	}

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	System.out.println(Arrays.toString(arr));
	reverseArray(arr);
	System.out.println(Arrays.toString(arr));
	}

}
 