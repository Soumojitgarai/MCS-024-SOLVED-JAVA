import java.io.File;
import java.io.FileNotFoundException;

public class FileCheck {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "my_file.txt";

        // Check if file exists
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Error: File does not exist!");
            return;
        }

        // Check if file is readable
        if (!file.canRead()) {
            System.out.println("Error: File is not readable!");
            return;
        }
    }
}

