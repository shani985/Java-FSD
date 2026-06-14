class Hello{
int a;
Hello(){
System.out.println("Hello- 0 arg");
}
Hello(int a){
System.out.println("Hello- 1 arg");
this.a=a;
this();
}
void show(){
System.out.println(a);
}
}
class Lab304{
public static void main(String args[]){
Hello h=new Hello(10);
h.show();
}
}