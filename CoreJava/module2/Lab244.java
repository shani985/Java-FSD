class Lab244 { 
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
for(int i=0;i<arr.length;i++){ 
for(int j=0;j<arr[i].length;j++){ 
for(int k=0;k<arr[i][j].length;k++){ 
System.out.print(arr[i][j][k]+"\t"); 
} 
System.out.println(""); 
} 
System.out.println("---------------------"); 
} 
}
}