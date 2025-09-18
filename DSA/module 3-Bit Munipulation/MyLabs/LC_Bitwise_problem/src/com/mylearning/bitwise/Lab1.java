package com.mylearning.bitwise;
//problem191 : count the set bit

public class Lab1 {

	public static void main(String[] args) {
		int n=9;
		int count=0;
		for(int i=1;i<=9;i++) {
//			if((n&1)==1) {
//				count++;
//			}
			if((n&n-1)==1) {
				count++;
			}
			
		n=n>>1;
		}
		System.out.println(count);//Time complexity O(1)
}
}
//time complexity O(32)/O(1)