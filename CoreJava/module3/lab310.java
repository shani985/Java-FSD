class Hello{
static int a=10;
static void show(){
int a=20;
System.out.println(a);
System.out.println(this.a);
}
}
class Lab310{
public static void main(String args[]){
Hello h=new Hello();
h.show();
}
}