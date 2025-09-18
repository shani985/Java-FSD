// print the following series 
//input : number of term in series
//1+2/x+3/x^2+4/x^3
class Lab38{

public static double power(double x,double p){
double result=1; 
for(int i=1;i<=p;i++){
result=result*x;
}
return result;
}
public static void main(String args[]){
int n=4;
int x=2;
double result=0.0;
for(int i=1;i<=n;i++){
result=result+i/power(x,i-1);
//Tc -o(n)
//Sc -o(1)