import java.io.File;

public class TraverseDirectory {
    public static void main(String[] args) {
        File directory = new File("path/to/your/directory");

        if (directory.exists() && directory.isDirectory()) {
            traverse(directory);
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }

    public static void traverse(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    traverse(file);  // Recursive call to traverse subdirectories
                } else {
                    System.out.println("File: " + file.getAbsolutePath());
                }
            }
        }
    }
}
