class Hai{
static int a=10; //Super
}
class Hello extends Hai{
static int a=20; // INstance
void show(){
int a=30; // Local
System.out.println(a);
System.out.println(Hello.a);
System.out.println(Hai.a);
}
}
class Lab409{
static public void main(String args[]){
Hello h= new Hello();
h.show();
}
}