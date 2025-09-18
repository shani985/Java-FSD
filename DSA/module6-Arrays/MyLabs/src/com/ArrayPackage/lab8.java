package com.ArrayPackage;

import java.util.Arrays;

//Array operation
//3)update operation
//update the element at given position

public class lab8 {
	
	public static void update(int arr[],int newelement,int pos) {
		arr[pos-1]=newelement;
		
	}
	

	public static void main(String[] args) {
		int arr[]=new int[7];
		arr[0]=10;
		arr[1]=14;
		arr[2]=15;
		arr[3]=16;
		arr[4]=17;
		arr[5]=18;
		arr[6]=19;
		update(arr,30,4);
		System.out.println(Arrays.toString(arr));
		update(arr,90,2);
		System.out.println(Arrays.toString(arr));
	}
		
		
}
