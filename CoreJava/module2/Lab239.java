class Lab239 { 
public static void main(String[] args) { 
int arr[][]= {{10,20,30},{40,50,60},{70,80,90}}; 
for(int i=0;i<arr.length;i++) { 
for(int j=0;j<arr[i].length;j++) { 
System.out.println(arr[i][j]); 
} 
} 
System.out.println("-------------------"); 
for(int [] myarr:arr) { 
for(int x:myarr) { 
System.out.println(x); 
} 
} 
} 
} 
