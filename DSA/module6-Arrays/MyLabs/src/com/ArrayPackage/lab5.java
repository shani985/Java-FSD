package com.ArrayPackage;

import java.util.Arrays;

//Array operation
//2)insert operation
//insert the element at given position

public class lab5 {

	public static void insert(int arr[],int element ,int pos) {
		int index=pos-1;
		for(int i=arr.length-1;i>index;i--){
			arr[i]=arr[i-1];
		}
		arr[index]=element;
		
	}
	public static void main(String[] args) {
		int arr[]=new int[10];
		arr[0]=10;
		arr[1]=14;
		arr[2]=15;
		arr[3]=16;
		arr[4]=17;
		arr[5]=18;
		arr[6]=19;
		insert(arr,60,3);
		System.out.println(Arrays.toString(arr));
		insert(arr,110,7);
		System.out.println(Arrays.toString(arr));
		insert(arr,90,1);
		System.out.println(Arrays.toString(arr));
		
	}
		
		
}
