class Lab242 { 
public static void main(String[] args) { 
int arr[][] = { 
{10,20,30,40,50}, 
{99,999}, 
{11,12,13,}, 
{51,52,53,54,54,56}, 
{1,2,3,4,5,6,7,8,9} 
}; 
System.out.println("Length : "+arr.length); 
System.out.println("-------------------"); 
for (int[] myarr : arr) { 
for (int x : myarr) 
System.out.print(x+"\t"); 
System.out.println(""); 
} 
} 
} 
