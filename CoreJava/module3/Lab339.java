class Hello{
void sum(int a,int b){
int sum=a+b;
System.out.println(sum);
}
}
class Lab339{
public static void main(String args[]){
Hello h= new Hello();
h.sum();
h.sum(10);
}
} 
