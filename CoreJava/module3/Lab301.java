class Hello{
int a=10;
static int b=20;
void show(){
String a="Hello";
String b="Hai";
System.out.println(a); // Local
System.out.println(b); // Local
System.out.println(this.a); // Instance
System.out.println(this.b); // Static
System.out.println(Hello.b); // Static
}
}
class Lab301{
public static void main(String args[]){
Hello h=new Hello();
h.show();
}
}