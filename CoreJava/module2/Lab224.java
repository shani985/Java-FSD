class Lab224 { 
public static void main(String jlc[]){ 
int arr[] = {10,20,30,40,50}; 
System.out.println("1. All starting from first"); 
for(int i=0;i<arr.length;i++) 
System.out.println(arr[i]); 
System.out.println("2. All starting from 3nd"); 
for(int i=2;i<arr.length;i++) 
System.out.println(arr[i]); 
System.out.println("3. Elements at Odd Indexs"); 
for(int i=0;i<arr.length;i=i+2) 
System.out.println(arr[i]); 
System.out.println("4. Elements in Reverse Order"); 
for(int i=arr.length-1;i>=0;i--) 
System.out.println(arr[i]); 
} 
} 
