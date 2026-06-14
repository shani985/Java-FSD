class B extends A {
B(){
this(10);
System.out.println("B-0 arg");
}
B(int a){
this();
System.out.println("B-1 arg");
}
}
class Lab417{
static public void main(String args[]){
new B(10);
}
} 
