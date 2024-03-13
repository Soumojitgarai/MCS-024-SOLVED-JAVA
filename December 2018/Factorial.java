public class Factorial {

    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int factorial = calculateFactorial(num);
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
