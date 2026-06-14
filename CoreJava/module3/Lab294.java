class Hello{
int a;
Hello(){
System.out.println("0 arg - Con");
}
Hello(int x){
System.out.println("1 arg - Con");
a=x;
}
void show(){
System.out.println("show() method");
System.out.println(a);
}
}
class Lab294{
public static void main(String args[]){
Hello h=new Hello();
h.show();
h.Hello(99);
}
}