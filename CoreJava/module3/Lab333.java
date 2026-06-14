class Hello{
String show(){
System.out.println("I am show()");
return null;
}
}
class Lab333{
public static void main(String args[]){
Hello h= new Hello();
String x = h.show();
System.out.println(x);
}
}