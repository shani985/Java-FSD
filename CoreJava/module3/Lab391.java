class Hai{
int a=10;
}
class Hello extends Hai{
int b=20;
}
class Lab391{
static public void main(String args[]){
Hai hai=new Hai();
System.out.println(hai.a);
Hello hello=new Hello();
System.out.println(hello.a);
System.out.println(hello.b);
}
}