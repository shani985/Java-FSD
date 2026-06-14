class Hai{
static{
System.out.println("Hai - S.B");
}
}
class Hello extends Hai{
static {
System.out.println("Hello - S.B");
}
}
class Lab388{
static public void main(String args[]){
Hello hello=new Hello();
}
}