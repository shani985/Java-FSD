package com.ArrayPackage;

//Array operation
//1)search  operation
public class lab4 {

	public static int linearSearch(int arr[],int element) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element) {
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {20,13,45,56,7,2,88,1};
		int element=6;
		int index=linearSearch(arr,element);
		System.out.println(index);
		if(index==-1) {
			System.out.println("sorry,element is not found");
		}else {
			System.out.println("Yes,element is found at "+index);	
		}
	}
		
		
}
