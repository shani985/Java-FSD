class A{
A(){
System.out.println("A - 0 arg");
}
}
class B extends A {
B(){
super();
System.out.println("B-0 arg");
}
B(int a){
this();
System.out.println("B-1 arg");
}
}
class Lab416{
static public void main(String args[]){
new B(10);
}
} 