package com.ArrayPackage;

public class lab1 {

	public static void main(String[] args) {
		//create array
		int arr[]=new int[6];
		//find the length
		System.out.println("length is "+arr.length);
		// access the element
		
		for(int i=0;i<arr.length;i++) {
			System.out.print("\t"+arr[i]);
		}
		
		System.out.println();
		// assigning the element
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		arr[4]=14;
		arr[5]=15;
		for(int x:arr) {
			System.out.print("\t"+x);
		}
	}	

}
