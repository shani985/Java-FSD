package com.mylearning.bitwise;
//problem1 : Find the weather last bit is Set or not
public class Lab1 {

	public static void main(String[] args) {
		int n=9;
		if((n&1)!=0) {
			System.out.println("last bit is set");
		}else {
			System.out.println("last bit is not set");
		}
	}
//Time complexity O(1)
}
