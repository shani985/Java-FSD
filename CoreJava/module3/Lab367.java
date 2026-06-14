class Hello{
int sum(int n){
//1. Base Case
if(n==1)
return 1;
//2. Recursive Call
return n + sum(n-1);
}
}
class Lab367{
public static void main(String args[]){
Hello h= new Hello();
int sum = h.sum(3);
System.out.println("Sum : "+sum);
}
}