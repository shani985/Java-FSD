class Test27{
public static void main(String args[]){
B ref=new B();
}
}
class A{
A(int a){
System.out.println("A Par. C");
}
}
class B extends A{
B(){
super(10);
System.out.println("B Def. C");
}
}