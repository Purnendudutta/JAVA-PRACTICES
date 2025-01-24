import java.io.File;

public class ListDirectories {
    public static void main(String[] args) {
        File directory = new File("path/to/your/directory");

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            System.out.println("Directories in " + directory.getAbsolutePath() + ":");

            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println(file.getName());
                }
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }
}
