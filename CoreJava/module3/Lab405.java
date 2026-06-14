class A{
A(){
System.out.println("A- 0 arg");
}
}
class B extends A{
B(){
System.out.println("B- 0 arg");
}
}
class C extends B{
C(){
System.out.println("C- 0 arg");
}
}
class Lab405{
static public void main(String args[]){
new C();
}
} 
