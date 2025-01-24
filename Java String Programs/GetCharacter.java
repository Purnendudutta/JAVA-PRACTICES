public class GetCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7; // The index of the character you want to get

        if (index >= 0 && index < str.length()) {
            char character = str.charAt(index);
            System.out.println("The character at index " + index + " is: " + character);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
