// print the following series 
//input : number of term in series
//0,1,3,8,6,27,9,64,12,125
class Lab37{
public static void main(String args[]){
int n=6;
int a=0;
int b=1;
for(int i=1;i<=n;i++)
{
System.out.print(a+"\t");
a=a+3;
b=i*i*i;
System.out.print(b+"\t");
}
}
}

