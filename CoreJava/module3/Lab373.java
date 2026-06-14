class Hello{
void show(int x,int... arr){
System.out.println("show(int... arr)");
System.out.println("x : "+x);
System.out.println("Length : "+arr.length);
}
}
class Lab373{
public static void main(String args[]){
Hello h= new Hello();
h.show(10);
h.show(55,66,77,88,99);
}
}
