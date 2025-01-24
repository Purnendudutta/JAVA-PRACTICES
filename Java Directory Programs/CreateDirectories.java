import java.io.File;

public class CreateDirectories {
    public static void main(String[] args) {
        String directoryPath = "path/to/your/directory/structure";

        File directories = new File(directoryPath);
        if (directories.mkdirs()) {
            System.out.println("Directories created successfully.");
        } else {
            System.out.println("Failed to create directories or directories already exist.");
        }
    }
}
