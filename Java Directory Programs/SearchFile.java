import java.io.File;

public class SearchFile {
    public static void main(String[] args) {
        String directoryPath = "path/to/your/directory";
        String fileNameToSearch = "fileToFind.txt";

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            boolean found = search(directory, fileNameToSearch);
            if (!found) {
                System.out.println("File not found.");
            }
        } else {
            System.out.println("The specified path is not a directory or does not exist.");
        }
    }

    public static boolean search(File directory, String fileNameToSearch) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    if (search(file, fileNameToSearch)) {
                        return true;
                    }
                } else if (file.getName().equalsIgnoreCase(fileNameToSearch)) {
                    System.out.println("File found: " + file.getAbsolutePath());
                    return true;
                }
            }
        }
        return false;
    }
}
