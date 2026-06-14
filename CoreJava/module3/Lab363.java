class Hai{
int a=10;
}
class Hello{
void show(Hai hai){
System.out.println("show : a = "+hai.a);
 hai.a= hai.a+10;
System.out.println("show : a = "+hai.a);
}
}
class Lab363{
public static void main(String args[]){
Hai hai = new Hai();
System.out.println("main : a = "+hai.a);
Hello h= new Hello();
h.show(hai);
System.out.println("main : a = "+hai.a);
}
} 
