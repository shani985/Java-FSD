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
class C extends B{
void m3(){
System.out.println("C - m3()");
}
}
class Lab394{
static public void main(String args[]){
C co = new C();
co.m1();
co.m2();
co.m3();
}
}