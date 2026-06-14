class Hello{
void sum(int... arr){
int sum = 0;
for(int x:arr){
sum = sum +x;
}
System.out.println("Sum : "+sum);
}
}
class Lab378{
public static void main(String args[]){
Hello h= new Hello();
h.sum();
h.sum(10);
h.sum(10,20);
h.sum(10,20,30);
}
} 
