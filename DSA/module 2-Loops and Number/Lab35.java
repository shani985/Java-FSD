// print the fibonacci series
class Lab35{
public static void main(String args[]){
int n=6;
int a=0;
int b=1;
System.out.print(a+"\t"+b+"\t");
for(int i=1;i<=n-2;i++){
int c=a+b;
System.out.print(c+"\t");
a=b;
b=c;
}
}
}
//Tc -o(n)
//Sc-o(1)