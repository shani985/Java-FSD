package com.mylearning.bitwise;
//problem2 :find the number is even or not
public class Lab2 {

	public static void main(String[] args) {
		 int n=265 ;
		if((n&1)==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
	}
	//Time complexity O(1)

}
