class A{
int a=10;
static int b=20;
static{
System.out.println("A- S.B");
}
{
System.out.println("A- I.B");
}
A(){
System.out.println("A- 0 arg");
}
}
class B extends A{
int c=30;
static int d=40;
static{
System.out.println("B- S.B");
}
{
System.out.println("B- I.B");
}
B(){
System.out.println("B- 0 arg");
}
}
class C extends B{
int e=50;
static int f=60;
static{
System.out.println("C- S.B");
}
{
System.out.println("C- I.B");
}
C(){
System.out.println("C- 0 arg");
}
}
class Lab406{
static public void main(String args[]){
new C();
}
} 
