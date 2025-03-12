import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for a character input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        // Convert the character to lowercase to handle both upper and lower case
        ch = Character.toLowerCase(ch);
        
        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            // Check if the character is a letter and not a vowel
            if (Character.isLetter(ch)) {
                System.out.println(ch + " is a consonant.");
            } else {
                System.out.println("Input is not a letter.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
