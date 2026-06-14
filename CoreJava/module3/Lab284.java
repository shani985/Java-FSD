class Hello{
void m1() {
int a=10;
{
System.out.println("I am LB-1");
int b=20;
System.out.println(a);
System.out.println(b);
//System.out.println(c);
}
{
System.out.println("I am LB-2");
int c=30;
System.out.println(a);
//System.out.println(b);
System.out.println(c);
}
}
}
class Lab284{
public static void main(String args[]){
Hello h=new Hello();
h.m1();
}
} 
