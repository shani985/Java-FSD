package com.arrayproblem;
import java.util.*;
//find the index of Min  element
public class problem5 {
	
	public static int minElementIndex(int arr[]) {
		int min=arr.length-1;
		for(int i=0;i<arr.length;i++){
			if(arr[min]>arr[i]) {
				min=i;
			}
		}
		return min;	
	}
public static void main(String[] args) {
	int arr[]= {100,20,3,40,57,70};
	System.out.println(Arrays.toString(arr));
	 int minIndex=minElementIndex(arr);
	System.out.println(minIndex);
	}

}
 