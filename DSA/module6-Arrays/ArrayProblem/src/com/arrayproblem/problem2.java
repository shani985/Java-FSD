package com.arrayproblem;
import java.util.*;
//reverse array 
// original Array is not  modified 
public class problem2 {
	public static int [] reverseArray(int arr[]) {
		int size=arr.length;
		int revArr[]=new int[size];
		for(int i=size-1,j=0;j<=size-1;i--,j++) {
			revArr[i]=arr[j];
		}
		return revArr;
		
		
	}

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	System.out.println(Arrays.toString(arr));
	int arr1[]=reverseArray(arr);
	System.out.println(Arrays.toString(arr1));
	}

}
 