class Hello{
void show(String str){
System.out.println("show(String)");
}
void show(Object obj){
System.out.println("show(Object)");
}
}
class Lab352{
public static void main(String args[]){
Hello h= new Hello();
h.show("JLC");
h.show(null);
}
}