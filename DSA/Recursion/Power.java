import java.math.*;
class Power {

    public static void main(String[] args) {
        double a = -100;
        int b = -3;
        double ans = myPow(a, b);

        System.out.println("Actual " + Math.pow(a, b));
        System.out.println(ans);
    }

    public static double myPow(double x, int n) {
        return ans(x, 1, n);
    }

    public static double ans(double x, double ans, int n) {
        if (n == 0)
            return ans;
        if (n < 0)
            return ans(1 / x, ans, n * -1);
        
        // System.out.println(ans);
        return ans(x, ans * x, n - 1);
    }

}