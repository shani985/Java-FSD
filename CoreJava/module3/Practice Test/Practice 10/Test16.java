class Test16{
public static void main(String args[]){
new B().x=101;
} }
class A{
static int x=99;
{
System.out.println("A I.B.");
}
}
class B extends A{
{
System.out.println("B I.B.");
}
}