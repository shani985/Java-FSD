class Hello{
int a=10;
void show(){
int a=20;
System.out.println(a); // Local
System.out.println(a); // Instance
}
}
class Lab298{
public static void main(String args[]){
Hello h=new Hello();
h.show();
}
}