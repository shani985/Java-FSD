package com.arrayproblem;
import java.util.*;
//reverse array 
//original Array is   modified 
public class problem1 {
	public static void reverseArray(int arr[]) {
		int size=arr.length;
		int revArr[]=new int[size];
			for(int j=0;j<size;j++) {
			revArr[j]=arr[size-1-j];		
		}
			for(int i=0;i<size;i++) {
				arr[i]=revArr[i];
			}
		
		
	}

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6};
	System.out.println(Arrays.toString(arr));
	reverseArray(arr);
	System.out.println(Arrays.toString(arr));
	}

}
 