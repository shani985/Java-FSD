class Hello{
int a;
Hello(){
this(10);
System.out.println("Hello- 0 arg");
}
Hello(int a){
this();
System.out.println("Hello- 0 arg");
}
}
class Lab307{
public static void main(String args[]){
Hello h=new Hello(99);
}
}