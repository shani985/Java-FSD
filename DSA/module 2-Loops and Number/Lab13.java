//count  the Divisible of given number 
class Lab13{
public static void main(String args[]){
int n=60;
int count =2;
for(int i=2;i<=n/2;i++){
if(n%i==0){
count++;
}
}
System.out.println(count);
}
}
//Tc -O(n/2)
//Sc -O(1);		
