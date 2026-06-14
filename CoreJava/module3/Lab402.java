class Hai {
static int a=10;
static {
System.out.println("Hai- S.B : a = "+a);
}
}
class Hello extends Hai {
static int b=20;
static {
System.out.println("Hello- S.B : a = "+a);
System.out.println("Hello- S.B : b = "+b);
}
}
class Lab402{
static public void main(String args[]){
int x = Hello.b;
}
}