public class FileReader {

    public static void main(String[] args) throws IOException {
        String filePath = "data.txt";
        FileInputStream inputStream = new FileInputStream(filePath);

        try {
            // Read data from the file
            byte[] data = new byte[1024];
            int bytesRead = inputStream.read(data);

            // Process or print data
            System.out.println(new String(data, 0, bytesRead));
        } catch (IOException e) {
            // Handle any exceptions during reading
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            // Close the file (ALWAYS executed)
            inputStream.close();
        }
    }
}
