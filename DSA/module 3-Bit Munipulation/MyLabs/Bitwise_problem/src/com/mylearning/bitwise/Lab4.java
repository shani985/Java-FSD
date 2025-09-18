package com.mylearning.bitwise;
//problem4 : count the bit set or not
public class Lab4 {

	public static void main(String[] args) {
		int n=26;
		int count =0;
		int loopCount=0;
		while(n>0) {
			loopCount++;
		if((n&1)!=0) {
			count++;
	}
		n=n>>1;
		}
		
		System.out.println(count);
		System.out.println(loopCount);
		System.out.println(Integer.MAX_VALUE);
	}
//Time complexity O(number of bit)
}
