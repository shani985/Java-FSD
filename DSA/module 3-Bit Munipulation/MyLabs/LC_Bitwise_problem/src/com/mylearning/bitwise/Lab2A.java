package com.mylearning.bitwise;
//problem231 : power of 2 or not
public class Lab2A {
public static boolean powerOfTwo(int num) {
	return(num>0)&&( (num&(num-1))==0);
}
//if((num&(num-1))==0)
//	return true;
//else
//	return false;
//}



	public static void main(String[] args) {
		int n=-32;
		boolean x=powerOfTwo(n);
		System.out.println("power of two "+x);
}
}
//time complexity O(1)