public class InsertString {
    public static void main(String[] args) {
        String originalStr = "Hello, World!";
        String insertStr = "Beautiful ";
        int index = 7; // The position where you want to insert the string

        if (index >= 0 && index <= originalStr.length()) {
            StringBuilder strBuilder = new StringBuilder(originalStr);
            strBuilder.insert(index, insertStr);
            String newStr = strBuilder.toString();
            System.out.println("Original string: " + originalStr);
            System.out.println("String after insertion: " + newStr);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
