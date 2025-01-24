import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StringToObjectExample {
    public static void main(String[] args) {
        // Example serialized object string
        String serializedObject = "rO0ABXNyABFqYXZhLnV0aWwuQXJyYXlMaXN..."; // A string representation of a serialized object

        try {
            Object obj = convertStringToObject(serializedObject);
            // Now you can use the object
            System.out.println("Object deserialized successfully: " + obj.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Object convertStringToObject(String str) throws IOException, ClassNotFoundException {
        byte[] data = java.util.Base64.getDecoder().decode(str);
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}
