// print the following pattern

public class Lab44_A{
public static void main(String args[]){
int row=7;
int star =1;
for(int i=1;i<=row/2+1;i++){
//print star
for(int j=1;j<=star;j++){
System.out.print("*");
}
//print new line
System.out.println();
star=star+1;
}
for(int i=1;i<=row/2;i++){
//print star
for(int j=1;j<=star-2;j++){
System.out.print("*");
}
//print new line
System.out.println();
star=star-1;
}
}
}
//TC -O(n^2)
//Tc O(row*star
//SC -O(1);
