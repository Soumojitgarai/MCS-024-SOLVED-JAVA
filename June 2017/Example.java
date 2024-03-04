import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = null; // Not initialized initially

        try {
            File file = new File("input.txt"); // Path to file

            scanner = new Scanner(file); // Potentially throws FileNotFoundException

            // Process file contents using scanner...

        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found!");
            e.printStackTrace(); // Optionally log for debugging
            // Add logic to handle file not found (e.g., prompt user for a different file)
        } finally {
            if (scanner != null) {
                scanner.close(); // Ensure proper resource cleanup
            }
        }
    }
}
