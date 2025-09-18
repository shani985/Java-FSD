// print the following series 
//input : number of term in series
//1,1,6,4,11,9,16,16,21,,25
class Lab36{
public static void main(String args[]){
int n=7;
int a=1;
int b=1;
for(int i=1;i<=n-1;i++){
System.out.print(a+"\t");
a=a+5;
b=i*i;
System.out.print(b+"\t");
}
}
}
//Tc -o(n)
//Sc -o(1);