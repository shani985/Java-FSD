class Hello{
void m1() {
int c=30;
{
System.out.println("I am Local Block");
System.out.println(c);
}
}
}
class Lab283{
public static void main(String args[]){
Hello h=new Hello();
h.m1();
}
}