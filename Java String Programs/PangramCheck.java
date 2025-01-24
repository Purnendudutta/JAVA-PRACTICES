public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        boolean isPangram = checkPangram(str);

        if (isPangram) {
            System.out.println("The given string is a pangram.");
        } else {
            System.out.println("The given string is not a pangram.");
        }
    }

    public static boolean checkPangram(String str) {
        boolean[] alphabet = new boolean[26];
        int index = 0;

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Traverse the string and mark the alphabets present
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
                alphabet[index] = true;
            }
        }

        // Check if all the alphabets are marked
        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) {
                return false;
            }
        }

        return true;
    }
}
