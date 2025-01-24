public class ReplaceCharacter {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7; // The index of the character you want to replace
        char newChar = 'J'; // The new character you want to insert

        if (index >= 0 && index < str.length()) {
            StringBuilder strBuilder = new StringBuilder(str);
            strBuilder.setCharAt(index, newChar);
            String newStr = strBuilder.toString();
            System.out.println("Original string: " + str);
            System.out.println("String after replacement: " + newStr);
        } else {
            System.out.println("Index is out of bounds.");
        }
    }
}
