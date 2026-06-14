class Hai{
int a=10; //Super
}
class Hello extends Hai{
int a=20; // INstance
void show(){
int a=30; // Local
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
}
class Lab407{
static public void main(String args[]){
Hello h= new Hello();
h.show();
}
}