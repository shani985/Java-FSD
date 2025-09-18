package com.ArrayPackage;

import java.util.Arrays;

//Array operation
//3)delete operation
//delete the element at given position

public class lab7 {
	public static int linearSearch(int arr[],int element) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
		
	}
public static void delete(int arr[],int pos) {
		
		for(int i= pos-1;i<=arr.length-2;i++){
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		
	}

	public static void deleteElement(int arr[],int element) {
		int myIndex= linearSearch(arr,element);
		if(myIndex!=-1) {
			delete(arr,myIndex+1);
		}
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
		deleteElement(arr,3);
		System.out.println(Arrays.toString(arr));
		deleteElement(arr,19);
		System.out.println(Arrays.toString(arr));
	}
		
		
}
