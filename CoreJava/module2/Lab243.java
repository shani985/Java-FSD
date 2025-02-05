class Lab243 { 
public static void main(String jlc[]){ 
int arr[][][] = new int[2][2][2]; 
arr[0][0][0] = 10; 
arr[0][0][1] = 20; 
arr[0][1][0] = 30; 
arr[0][1][1] = 40; 
arr[1][0][0] = 50; 
arr[1][0][1] = 60; 
arr[1][1][0] = 70; 
arr[1][1][1] = 80; 
for(int [][]x : arr){ 
for(int []y:x){ 
for(int z:y){ 
System.out.print(z+"\t"); 
} 
System.out.println(""); 
} 
System.out.println("---------------------------"); 
} 
} 
}