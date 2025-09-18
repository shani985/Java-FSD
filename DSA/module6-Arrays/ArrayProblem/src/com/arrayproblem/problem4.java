package com.arrayproblem;
import java.util.*;
//find the index of max element
public class problem4 {
	
	public static int maxElementIndex(int arr[]) {
		int maxInd=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[maxInd]<arr[i]) {
				maxInd=i;
			}
		}
		return maxInd;
		
	}

	public static void main(String[] args) {
	int arr[]= {1,20,3,40,57,70};
	System.out.println(Arrays.toString(arr));
	 int index=maxElementIndex(arr);
	System.out.println(index);
	}

}
 