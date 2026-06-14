class Hello{
Hello(){
System.out.println("0 arg - Con");
}
void show(){
System.out.println("show() method");
}
}
class Lab293{
public static void main(String args[]){
Hello h=new Hello();
h.show();
}
}