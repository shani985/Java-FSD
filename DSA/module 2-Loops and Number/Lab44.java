// print the following pattern

public class Lab44{
public static void main(String args[]){
int row=5;
int star =5;
for(int i=1;i<=row;i++){
//print star
for(int j=1;j<=i;j++){
System.out.print("*");
}
//print new line
System.out.println();
}
for(int i=1;i<row;i++){
//print star
for(int j=i;j<star;j++){
System.out.print("*");
}
//print new line
System.out.println();
}
}
}
//TC -O(n^2)
//Tc O(row*star
//SC -O(1);
