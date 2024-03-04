import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {

    public static void main(String[] args) throws IOException {
        // File path
        String filePath = "path/to/your/binary/file.bin";

        // Open the file in read mode
        FileInputStream inputStream = new FileInputStream(filePath);

        // Read the file byte by byte
        byte[] buffer = new byte[1024]; // Buffer for reading bytes
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            // Write the read bytes to standard output
            System.out.write(buffer, 0, bytesRead);
        }

        // Close the stream
        inputStream.close();
    }
}
