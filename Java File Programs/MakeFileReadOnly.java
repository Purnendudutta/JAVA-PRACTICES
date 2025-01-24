import java.io.File;

public class MakeFileReadOnly {
    public static void main(String[] args) {
        File file = new File("example.txt");

        if (file.exists()) {
            boolean isReadOnly = file.setReadOnly();

            if (isReadOnly) {
                System.out.println("File is now read-only.");
            } else {
                System.out.println("Failed to set the file as read-only.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
