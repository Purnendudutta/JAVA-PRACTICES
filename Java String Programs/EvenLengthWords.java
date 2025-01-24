public class EvenLengthWords {
    public static void main(String[] args) {
        String str = "Hello world! This is Java programming.";
        printEvenLengthWords(str);
    }

    public static void printEvenLengthWords(String str) {
        String[] words = str.split("\\s+");

        System.out.println("Even length words:");
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
