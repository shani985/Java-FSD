
package com.arrayproblem;
import java.util.*;
//print the extreme element
public class problem7 {
	
	public static void extremeElement(int arr[]) {
		int start=0;
		int end=arr.length-1;
		while(start<=end){
			if(start==end) {
				System.out.println(arr[start]);
			}else {
				System.out.println(arr[start]);
				System.out.println(arr[end]);
			}
			
			start++;
			end--;
		}
		
	}

	public static void main(String[] args) {
	int arr[]= {10,20,3,40,57,0};
	System.out.println(Arrays.toString(arr));
	extremeElement(arr);
	}

}

 