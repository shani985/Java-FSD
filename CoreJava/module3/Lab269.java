class Hello{
int a;
static int b;
{
System.out.println("I am I.B ");
System.out.println(a);
a=10;
System.out.println(a);
}
static{
System.out.println("I am S.B ");
System.out.println(b);
b=20;
System.out.println(b);
}
}
class Lab269{ 
public static void main(String args[]){
Hello h=new Hello();
}
}