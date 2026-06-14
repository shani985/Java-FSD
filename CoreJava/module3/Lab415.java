class A{
int a;
A(){
System.out.println("A - 0 arg");
}
A(int a){
System.out.println("A - 1 arg");
this.a=a;
}
}
class B extends A {
int b;
B(){
super();
System.out.println("B-0 arg");
}
B(int a,int b){
super(a);
System.out.println("B-2 arg");
this.b=b;
}
}
class C extends B {
int c;
C(){
super();
System.out.println("C-0 arg");
}
C(int a,int b,int c){
super(a,b);
System.out.println("C-3 arg");
this.c=c;
}
void show(){
System.out.println(a);
System.out.println(b);
System.out.println(c);
}
} 
class Lab415{
static public void main(String args[]){
C co1= new C(10,20,30);
co1.show();
System.out.println("-------------");
C co2= new C();
co2.show();
}
} 

