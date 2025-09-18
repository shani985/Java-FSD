package com.ArrayPackage;

//Array operation
//2)insert operation
//insert the element at given position

public class lab5_1 {

	public static int[] insert(int arr[],int element ,int pos) {
		int index=pos-1;
		for(int i=arr.length-1;i>index;i--){
			arr[i]=arr[i-1];
		}
		arr[index]=element;
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {20,13,45,56,7,2,88,1};
		int element=6;
		int position=3;
		int arr1[]=insert(arr,element,position);
		for(int x:arr1) {
			System.out.print("\t"+x);
		}
		
	}
		
		
}
