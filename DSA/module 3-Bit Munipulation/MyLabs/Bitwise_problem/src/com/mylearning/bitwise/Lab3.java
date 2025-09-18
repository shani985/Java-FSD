package com.mylearning.bitwise;
//
//problem2 :find the whether kth bit set or not
//position start from right :consider LSB as first bit 
public class Lab3 {

	public static void main(String[] args) {
		 int n=25;
		 int k=5 ;
for(int i=1;i<=k-1;i++) {
	n=n>>1;
}
		if((n&1)!=0) {
			System.out.println(" kth bit is set ");
		}else {
			System.out.println("kth bit is  not set");
		}
	}
	//Time complexity O(k)

}
