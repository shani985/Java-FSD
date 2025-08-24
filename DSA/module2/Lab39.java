// print the following series 
//input : number of term in series
//1-2/x+3/x^2-4/x^3
class Lab39{

public static double power(double x,double p){
double result=1; 
for(int i=1;i<=p;i++){
result=result*x;
}
return result;
}
public static void main(String args[]){
int n=5;
int x=2;
double result=0.0;
int sign=1;
for(int i=1;i<=n;i++){

result=result+(sign)*(i/power(x,i-1));
sign=sign*-1;
}
System.out.println(result);
}
}
