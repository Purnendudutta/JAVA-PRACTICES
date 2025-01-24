import java.io.File;
import java.io.IOException;

public class CreateTempFile {
    public static void main(String[] args) {
        try {
            // Create a temporary file
            File tempFile = File.createTempFile("myTempFile", ".txt");

            // Print the absolute path of the temporary file
            System.out.println("Temporary file created: " + tempFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
