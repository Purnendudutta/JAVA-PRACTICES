import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.io.IOException;

public class ReadZipFile {
    public static void main(String[] args) {
        String zipFilePath = "example.zip";

        try (ZipFile zipFile = new ZipFile(zipFilePath)) {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();

            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                System.out.println("File: " + entry.getName());

                if (!entry.isDirectory()) {
                    try (BufferedReader reader = new BufferedReader(
                            new InputStreamReader(zipFile.getInputStream(entry)))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    }
                }
                System.out.println("----------------------------");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
