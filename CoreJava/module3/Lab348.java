class Hello{
void show(byte a,int b){
System.out.println("show(byte,int)");
}
}
class Lab348{
public static void main(String args[]){
Hello h= new Hello();
h.show(10,20);
}
}