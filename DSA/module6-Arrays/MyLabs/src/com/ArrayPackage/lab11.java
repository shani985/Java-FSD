
package com.ArrayPackage;

import java.util.Arrays;

//Array implemention
class MyArray{
	int size;
	int capacity;
	int arr[];
	MyArray(){ 
		this.size=0;
		this .capacity=10;
		this.arr=new int[capacity];
	}
	MyArray(int capacity){
		this.size=0;
		this .capacity=capacity;
		this.arr=new int[capacity];
	}
	public int size() {
		return size;  
	}
	public boolean isEmpty() {
		return (size==0);
	}
	public int capacity() {
		return capacity; 
	}
	public void add(int position,int element) {
		if(size==capacity) {
			resizeArray();
		}
		int myindex=position-1;
		for(int i=capacity-1;i>myindex;i--) {
			arr[i]=arr[i-1];
			
		}
		arr[myindex]=element; 
 		size++;
	}
	public void add(int element) {
		if(size==capacity) {
			//resize the array
			resizeArray();
		}
		
		arr[size]=element;
		size++;
	} 
	private void resizeArray() {
		int newCapacity=capacity+capacity/2;
		int temp[]= new int[newCapacity]; 
		System.arraycopy(arr, 0, temp, 0,capacity);
		this.arr=temp;
		this.capacity=newCapacity;
	}
	public void removeAt(int index) {
		 
		for(int i=index;i<size;i++) {
			arr[i]=arr[i+1];
		}
		arr[size-1]=0; 
		size--;
	}
	public boolean contains(int element)  {
		for(int i=0;i<arr.length;i++){
			if(arr[i]==element);
			return true;
		}
		return false;
		
	}
	public void removeElement(int element) {
		int myindex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				myindex=i;
			}
		}
		
		if(myindex!=-1) {
			removeAt(myindex);
		}
	}
		
	public void update(int index,int newelement) {
		arr[index]=newelement;
		
	}
	
	public void clear() {
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=0;
//		}
		this.size=0;
		this.capacity=10;
		int temp[]=new int[this.capacity];
		this.arr=temp;
		
	}
	
	public String toString(){
//		return Arrays.toString(arr);
		String str="[";
		for(int i=0;i<size;i++) {
			str=str+""+arr[i]+",";
		}
		if(size !=0) {
			str=str.substring(0,str.length()-1);
		}
			str=str+"]";
			return str;
		
		
	}
} 

public class lab11 {
	public static void main(String[] args) {
		MyArray array=new MyArray(5); 
		System.out.println(array);
		System.out.println(array.size());
		System.out.println(array.capacity());
		System.out.println(array.isEmpty());  
		
		array.add( 10);
		array.add( 20);
		array.add( 30);
		array.add( 40);
		array.add( 50);
	
		System.out.println(array);
		System.out.println(array.size());
		System.out.println(array.capacity());
		System.out.println(array.isEmpty());
		array.add(1, 10);
		array.add(2, 200);
		array.add(3, 30);
		array.add(4, 40);
		array.add(5, 50);
		array.add(6, 70);
		System.out.println(array);
		System.out.println(array.size);
		System.out.println(array.capacity());
		System.out.println(array.isEmpty());
		array.removeAt(0);
		System.out.println(array);
		System.out.println(array.size);
		System.out.println(array.capacity());
		System.out.println(array.isEmpty());
		array.removeAt(5);
		System.out.println(array);
		System.out.println(array.size);
		System.out.println(array.capacity());
		System.out.println(array.isEmpty());
	System.out.println(array.contains(99));	
	System.out.println(array.contains(10));	
//	array.removeElement(20);
	array.update(0,99);
	array.update(2,88);
	
	System.out.println(array);
	System.out.println(Arrays.toString(array.arr));
	
		array.clear();
		System.out.println(array);
		System.out.println(array.size);
		System.out.println(array.capacity());
		System.out.println(array.isEmpty());
		System.out.println(Arrays.toString(array.arr));
		
	}
}
