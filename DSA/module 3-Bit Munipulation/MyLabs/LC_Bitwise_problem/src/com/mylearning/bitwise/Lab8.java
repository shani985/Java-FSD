package com.mylearning.bitwise;
//problem476:   number complment
public class Lab8 {
	public static int findComplement(int num) {
		int result=0;
		int count=0;
		while(num!=0) {
		if((num&1)==0) {
			result=result+(1<<count);
		}
		count++;
		num=num>>1;
		}
		return result;
	}      
	


	public static void main(String[] args) {
int  x=findComplement(4);
System.out.println(x);
}
}
//time complexity O(1)