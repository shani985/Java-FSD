class Hello{
boolean b1;
byte b2;
short s;
int a;
long b;
float f;
double d1;
String str;
Hello h;
void show()
{
System.out.println(b1);
System.out.println(b2);
System.out.println(s);
System.out.println(a);
System.out.println(b);
System.out.println(f);
System.out.println(d1);
System.out.println(str);
System.out.println(h);
}
}
class Lab1{
public static void main(String args[])
{
Hello r = new Hello();
r.show();
}
}