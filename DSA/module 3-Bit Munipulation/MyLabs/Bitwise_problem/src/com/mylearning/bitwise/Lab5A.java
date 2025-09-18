package com.mylearning.bitwise;
//problem4 : check whether given number is 2 power or not
public class Lab5A {

	public static void main(String[] args) {
		int n=1024;
		int count =0;
	
		while(n>0) {
			n=n&n-1;
			count++;
		
		}
		if(count==1) {
			System.out.println("number is 2  power");
		}else {
			System.out.println("number is  not 2  power");
		}
		
	}
//Time complexity O(1)
}
