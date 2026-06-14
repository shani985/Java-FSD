class Hello{
void show(String str,int... arr){
System.out.println("show(String str,int...
arr)");
}
}
class Lab377{
public static void main(String args[]){
Hello h= new Hello();
h.show("JLC");
}
}