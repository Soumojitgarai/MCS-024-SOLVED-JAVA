public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        // ArithmeticException (division by zero)
        try {
            int result = 10 / 0; // Intentionally causing an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        }

        // ArrayIndexOutOfBoundsException (accessing out-of-bounds element)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Accessing invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds.");
        }

        // NumberFormatException (parsing invalid string to integer)
        String numStr = "abc";
        try {
            int num = Integer.parseInt(numStr);
            System.out.println("Number: " + num);
        } catch (NumberFormatException e) {
            System.err.println("Error: Invalid string format for integer conversion.");
        }

        // Finally block (always executed)
        finally {
            System.out.println("This block always executes after the try-catch block, regardless of exceptions.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

