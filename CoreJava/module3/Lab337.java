class Hello{
boolean isEven(int n){
if(n%2==0)
 return true;
else
return false;
}
}
class Lab337{
public static void main(String args[]){
Hello h= new Hello();
boolean x= h.isEven(9);
System.out.println(x);
}
} 
