class Hai{
int a=10;
void m1(){
System.out.println("m1 - a = "+ a);
System.out.println("m1 - b = "+ b);
}
}
class Hello extends Hai{
int b=20;
void m2(){
System.out.println("m2 - a = "+ a);
System.out.println("m2 - b = "+ b);
}
}
class Lab392{
static public void main(String args[]){
Hello hello=new Hello();
hello.m1();
hello.m2();
}
}