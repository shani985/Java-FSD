class Hello{
static int b;
static{
System.out.println("I am S.B ");
b=20;
System.out.println(b);
}
}
class Lab267{
public static void main(String args[]){
System.out.println("In Main : b = "+Hello.b);
}
}