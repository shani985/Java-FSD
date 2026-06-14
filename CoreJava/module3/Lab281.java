class Hello{
int a=10;
static int b=20;
void m1() {
int c=30;
}
}
class Lab281{
public static void main(String args[]){
Hello h=new Hello();
System.out.println(h.a);
System.out.println(h.b);
System.out.println(h.c);
}
}