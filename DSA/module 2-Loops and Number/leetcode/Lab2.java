// 50. Pow(x, n)
class Lab2 {

    public static double pow(double x, int n) {
if(n<0){
x=1/x;
n=-n;
}
        double result = 1.0;
        for (int i = 1; i <= n; i++) {
            result = result * x;   
        }
        return result;
    }

    public static void main(String args[]) {
        double x = 2.00000; 
        int n = -2;
        System.out.println(pow(x, n));  
    }
}
