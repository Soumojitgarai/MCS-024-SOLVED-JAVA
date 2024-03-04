public class StringToIntExample {
    public static void main(String[] args) {
        String stringNumber = "127";
        int integerValue;

        // Use Integer.parseInt() to convert the string to an integer
        try {
            integerValue = Integer.parseInt(stringNumber);
            System.out.println("Integer value: " + integerValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid numerical string: " + stringNumber);
        }
    }
}

