class Hello{
void printNums(int n){
//1. Base Case
if(n==0)
return;
//2. Recursive Call
printNums(n-1);
//3. Sub-Task Logic
System.out.println(n);
}
}
class Lab366{
public static void main(String args[]){
Hello h= new Hello();
h.printNums(5);
System.out.println("Done !!!");
}
}