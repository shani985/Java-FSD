import java.util.Scanner;

public class Lab41 {

    // Factorial method
    static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Formula method
    static double usingFormula(int x) {
        return (1 - Math.exp(-x)) / (x * factorial(x));
    }

    // Series method with alternating signs
    static double usingSeries(int x, int terms) {
        double sum = 0.0;
        for (int n = 0; n < terms; n++) {
            double term = Math.pow(-1, n) * Math.pow(x, n) / factorial(x + n);
            sum += term;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        // Using formula
        double result1 = usingFormula(x);

        // Using alternating series (approx with 20 terms)
        double result2 = usingSeries(x, 20);

        System.out.println("Result using formula (alt signs) = " + result1);
        System.out.println("Result using series  (alt signs) = " + result2);

       
    }
}
