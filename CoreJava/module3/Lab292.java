class Hello{
int a;
{
System.out.println("Instance Block");
System.out.println(a);
}
Hello(){
System.out.println("0 arg - Con");
}
void show(){
System.out.println("show() method");
System.out.println(a);
}
} class Lab292{
public static void main(String args[]){
Hello h=new Hello(99);
h.show();
}
}