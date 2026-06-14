class Hello{
int show(){
System.out.println("I am show()");
return 99;
}
}
class Lab324{
public static void main(String args[]){
Hello h1= new Hello();
int x=h1.show();
System.out.println(x);
Hello h2= new Hello();
h2.show();
}
}