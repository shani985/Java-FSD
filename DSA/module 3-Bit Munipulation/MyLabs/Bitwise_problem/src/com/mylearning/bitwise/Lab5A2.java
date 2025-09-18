package com.mylearning.bitwise;
//problem4 : check whether given number is 2 power or not
public class Lab5A2 {

	public static void main(String[] args) {
		int n=1024;
		if((n&(n-1))==0) {
			System.out.println("number is 2  power");
		}else {
			System.out.println("number is  not 2  power");
		}  
		
	}
//Time complexity O(1)
}
