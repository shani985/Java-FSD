package com.ArrayPackage;

import java.util.Arrays;

//Array operation
//3)update operation
//update the element at given position

public class lab9 {
	public static int linearSearch(int arr[],int element) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
		
	}

	public static void update(int arr[],int newelement,int pos) {
		arr[pos-1]=newelement;
		
	}
	
	
	public static void updateElement(int arr[],int newelement,int oldelement) {
				int myindex=linearSearch(arr,oldelement);
				if(myindex!=-1) {
					update(arr,newelement,myindex+1);
					
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
		updateElement(arr,40,10);
		System.out.println(Arrays.toString(arr));
		updateElement(arr,9,19);
		System.out.println(Arrays.toString(arr));
	}
		
		
}
