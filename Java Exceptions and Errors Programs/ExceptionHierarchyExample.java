import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            // Checked exception
            File file = new File("nonexistentfile.txt");
            FileReader fileReader = new FileReader(file);

            // Runtime exception
            int[] arr = new int[5];
            System.out.println(arr[10]);

            // Error (usually not caught, but for demonstration)
            // throw new StackOverflowError();

        } catch (FileNotFoundException e) {
            System.out.println("Caught a checked exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught a runtime exception: " + e);
        } catch (StackOverflowError e) {
            System.out.println("Caught an error: " + e);
        } catch (Exception e) {
            System.out.println("Caught a general exception: " + e);
        }
    }
}
