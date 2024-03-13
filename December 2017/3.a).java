public class MathUtils {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        double result1 = MathUtils.add(3.14, 2.71); // No need to create object
        double result2 = MathUtils.multiply(4, 5);
        System.out.println("Sum: " + result1);
        System.out.println("Product: " + result2);
    }
}
