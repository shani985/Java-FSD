package com.arrayproblem;
import java.util.*;
//find the  minimum element
public class problem6 {
	
	public static int minElement(int arr[]) {
		int min=arr[arr.length-1];
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
		
	}

	public static void main(String[] args) {
	int arr[]= {10,20,3,40,57,0};
	System.out.println(Arrays.toString(arr));
	 int min=minElement(arr);
	System.out.println(min);
	}

}
 