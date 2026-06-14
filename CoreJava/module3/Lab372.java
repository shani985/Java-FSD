class Hello{
void show(int x,int... arr){ //Fixed and Var Args
System.out.println("show(int... arr)");
}
}
class Lab372{
public static void main(String args[]){
Hello h= new Hello();
h.show();
}
}