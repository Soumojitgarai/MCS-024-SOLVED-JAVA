import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String[] args) {
        String sourceFile = "path/to/source.txt"; // Replace with the actual path
        String destinationFile = "path/to/destination.txt"; // Replace with the actual path

        try (FileInputStream in = new FileInputStream(sourceFile);
            FileOutputStream out = new FileOutputStream(destinationFile)) {
            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }
            System.out.println("File copied successfully!");
        } catch (FileNotFoundException e) {
            System.err.println("Error: Source file not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error: IOException occurred: " + e.getMessage());
        }
    }
}
