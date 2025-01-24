public class StringToByteExample {
    public static void main(String[] args) {
        String str = "A"; // This is the string to convert
        byte[] byteArray = str.getBytes();

        // Print the byte values
        for (byte b : byteArray) {
            System.out.println(b);
        }
    }
}
