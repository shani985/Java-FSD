class Lab241 { 
public static void main(String[] args) { 
int temp[]= {11,22,33,44,55}; 
int arr[][] =new int[3][]; 
System.out.println("Length : "+arr.length); 
arr[0]=new int[6]; 
arr[1]= new int[]{10,20,30}; 
arr[2]=temp; 
System.out.println("-------------------"); 
for (int[] myarr : arr) { 
for (int x : myarr) 
System.out.print(x+"\t"); 
System.out.println(""); 
} 
} 
} 