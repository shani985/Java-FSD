class Hello{
void printNums(int n){
//1. Base Case
if(n==0)
return;
//2. SubTask Logic
System.out.println(n);
//3. Recursive Call
printNums(n-1);
}
}
class Lab365{
public static void main(String args[]){
Hello h= new Hello();
h.printNums(5);
System.out.println("Done !!!");
}
}
