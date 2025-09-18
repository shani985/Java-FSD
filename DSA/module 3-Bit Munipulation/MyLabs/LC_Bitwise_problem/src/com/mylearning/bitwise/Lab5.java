package com.mylearning.bitwise;
//problem260 : SINGLE NUMBER 3
//find the odd element in array
public class Lab5 {
public static int[] singleNumber(int []num) {
	int x=0;
	for(int i=0;i<num.length;i++) {
		x=x^num[i];
	}
	int maskBit=x&(~(x-1));
	int result[]= {0,0};
	for(int i=0;i<num.length;i++) {
		if((num[i]&maskBit)!=0) {
			result[0]=result[0]^num[i];
		}else {
			result[1]=result[1]^num[i];
		}
	}
	return result; 
}
	public static void main(String[] args) {
     int a[]= {-1,0};
     int x[]=singleNumber(a);
    
    	 System.out.println(x[0]);
    	 System.out.println(x[1]);
     
}
}
//time complexity O(1)