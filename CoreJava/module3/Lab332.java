class Hello{
String show(){
System.out.println("I am show()");
String str="Hello Guys !!!";
return str;
}
}
class Lab332{
public static void main(String args[]){
Hello h= new Hello();
String x = h.show();
System.out.println(x);
}
}