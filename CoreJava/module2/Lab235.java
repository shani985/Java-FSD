class Lab235 { 
public static void main(String jlc[]){ 
int arr[][] = new int[2][2]; 
arr[0][0]=10; arr[0][1]=20; 
arr[1][0]=30; arr[1][1]=40; 
for(int i=0;i<arr.length;i++){ 
//1. Print Array 
for(int j=0;j<arr[i].length;j++){ 
System.out.print(arr[i][j]+"\t"); 
} 
//2. Print Newline 
System.out.println(""); 
} 
} 
} 