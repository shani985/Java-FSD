class Hello{
void show(int... arr){ //Var Args
System.out.println("show(int... arr)");
for(int x:arr)
System.out.println(x);
}
}
class Lab371{
public static void main(String args[]){
Hello h= new Hello();
h.show();
h.show(10);
h.show(10,20);
h.show(10,20,30);
h.show(10,20,30,40);
h.show(10,20,30,40,50);
}
}