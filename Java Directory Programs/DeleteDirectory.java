import java.io.File;

public class DeleteDirectory {
    public static void main(String[] args) {
        File directory = new File("path/to/your/directory");

        if (directory.exists() && directory.isDirectory()) {
            boolean result = deleteDirectory(directory);
            if (result) {
                System.out.println("Directory deleted successfully.");
            } else {
                System.out.println("Failed to delete the directory.");
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }

    public static boolean deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        return directory.delete();
    }
}
