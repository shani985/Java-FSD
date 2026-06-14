class Hello{
int a;
{
System.out.println("Instance Block");
System.out.println(a);
}
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
class Lab291{
public static void main(String args[]){
Hello h1=new Hello();
h1.show();
Hello h2=new Hello(99);
h2.show();
}

}