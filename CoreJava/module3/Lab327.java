class Hello{
int show(){
System.out.println("I am show()");
return 99L;
}
}
class Lab327{
public static void main(String args[]){
Hello h= new Hello();
h.show();
}
}