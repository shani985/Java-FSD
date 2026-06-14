class A{
void m1(){
System.out.println("A - m1()");
}
}
class B extends A{
void m2(){
System.out.println("B - m2()");
}
}
class C extends A{
void m3(){
System.out.println("C - m3()");
}
}
class Lab395{
static public void main(String args[]){
B bo = new B();
bo.m1();
bo.m2();
//bo.m3();
C co = new C();
co.m1();
//co.m2();
co.m3();
}
} 
