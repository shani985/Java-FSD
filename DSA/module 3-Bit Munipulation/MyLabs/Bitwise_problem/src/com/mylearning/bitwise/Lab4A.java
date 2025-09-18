package com.mylearning.bitwise;
//problem4 : count the bit set or not
//Brain kerningam algorithim
//visiting only set bits and counting the SetBits
public class Lab4A {

	public static void main(String[] args) {
		int n=26;
		int count =0;
		
		while(n>0) {
			n=n&n-1;
			count++;
		
		}
		
		System.out.println(count);
	
	}
//Time complexity O(1)
}
