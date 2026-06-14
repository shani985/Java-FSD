class Hai{
int a=10;
}
class Hello{
int b=20;
}
class Lab389{
static public void main(String args[]){
Hai hai=new Hai();
System.out.println(hai.a);
System.out.println(hai.b); //
Hello hello=new Hello();
System.out.println(hello.a); //
System.out.println(hello.b);
}
}