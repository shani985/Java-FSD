class Hai{
void m1(){
System.out.println("Hai-m1()");
}
}
class Hello extends Hai {
void m1(){
System.out.println("Hello-m1()");
}
void show(){
System.out.println("show-begin");
m1();
this.m1();
super.m1();
System.out.println("show-end");
}
}
class Lab411{
static public void main(String args[]){
Hello h= new Hello();
h.show();
} }