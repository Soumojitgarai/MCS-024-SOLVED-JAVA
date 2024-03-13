public class Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

public class Main {

    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 5.2;

        System.out.println("Addition: " + Calculator.add(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtract(num1, num2));
        System.out.println("Multiplication: " + Calculator.multiply(num1, num2));

        // Handle potential division by zero exception
        try {
            System.out.println("Division: " + Calculator.divide(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
