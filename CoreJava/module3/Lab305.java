class Hello{
int a;
Hello(){
System.out.println("Hello- 0 arg");
}
Hello(int a){
this();
System.out.println("Hello- 1 arg");
this.a=a;
}
void show(){
System.out.println(a);
}
}
class Lab305{
public static void main(String args[]){
Hello h=new Hello(10);
h.show();
}
}