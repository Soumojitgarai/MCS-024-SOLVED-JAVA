class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, double b) {
        return a + b; // Automatically converts integer to double
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));   // Output: 8 (int + int)
        System.out.println(calc.add(5.5, 2.3)); // Output: 7.8 (double + double)
        System.out.println(calc.add(7, 3.14)); // Output: 10.14 (int + double)
    }
}
