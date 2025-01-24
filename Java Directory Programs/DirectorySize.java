import java.io.File;

public class DirectorySize {
    public static void main(String[] args) {
        File directory = new File("path/to/your/directory");

        if (directory.exists() && directory.isDirectory()) {
            long size = getSize(directory);
            System.out.println("Total size of directory: " + size + " bytes");
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }

    public static long getSize(File directory) {
        long size = 0;
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    size += getSize(file);  // Recursive call to get the size of subdirectories
                } else {
                    size += file.length();  // Add the size of the file
                }
            }
        }
        return size;
    }
}
