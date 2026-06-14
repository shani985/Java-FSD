class Test19{
public static void main(String args[]){
B ref=new B();
ref.show();
}
}
class A{ int x=10; }
class B extends A{
void show(){
A ref=new A();
System.out.println(ref.x);
}
} 
