class Hai {
int a=10;
{
System.out.println("Hai- I.B : a = "+a);
}
}
class Hello extends Hai {
int b=20;
{
System.out.println("Hello- I.B : a = "+a);
System.out.println("Hello- I.B : b = "+b);
}
}
class Lab401{
static public void main(String args[]){
Hello hello=new Hello();
}
} 
