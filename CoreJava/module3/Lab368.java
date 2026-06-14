class Hello{
int fact(int n){
//1. Base Case
if(n==0 || n==1)
return 1;
//2. Recursive Call
return n * fact(n-1);
}
}
class Lab368{
public static void main(String args[]){
Hello h= new Hello();
int fact = h.fact(5);
System.out.println("Fact : "+fact);
}
}