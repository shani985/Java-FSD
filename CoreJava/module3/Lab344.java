class Hello{
void show(int a,int b){
System.out.println("show(int,int)");
}
void show(String x,int y){
System.out.println("show(String,int)");
}
}
class Lab344{
public static void main(String args[]){
Hello h= new Hello();
h.show(10,20);
h.show("Hello",20);
}
}