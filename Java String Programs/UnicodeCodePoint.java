public class UnicodeCodePoint {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7; // The index of the character you want to check

        if (index >= 0 && index < str.length()) {
            int codePoint = str.codePointAt(index);
            System.out.println("The Unicode code point at index " + index + " is: " + codePoint);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
