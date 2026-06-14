class A{ }
class B extends A{ }
class C extends B{ }
class Hello{
/*
void show(C co){
System.out.println("show(C)");
}
void show(B bo){
System.out.println("show(B)");
}
void show(A ao){
System.out.println("show(A)");
} 
*/
void show(Object obj){
System.out.println("show(Object)");
}
}
class Lab360{
public static void main(String args[]){
Hello h= new Hello();
C co=new C();
h.show(co);
B bo=new B();
h.show(bo);
A ao=new A();
h.show(ao);
Object obj = new Object();
h.show(obj);
}
}