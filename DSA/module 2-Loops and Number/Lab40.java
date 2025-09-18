// 1/(x)!+x/(x+1)!+x^2/(x+2)!+x^3/(x+3)
import java.util.Scanner;
public  class Lab40{
public static double fact(double n){
double fact=1;
for(int i=1;i<=n;i++){
}
return fact;
}
public static double usingSeries(double x, double terms) {
        double sum = 0.0;
        for (int n = 0; n < terms; n++) {
            sum += Math.pow(x, n) / fact(x + n);
        }
        return sum;
    }
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();
  double result2 = usingSeries(x, 20);
System.out.println("Result using series  = " + result2);
}
}


