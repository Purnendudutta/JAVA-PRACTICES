public class SplitString {
    public static void main(String[] args) {
        String str = "This is a test string to split into sub-strings";
        String delimiter = " "; // Delimiter to split by (space in this case)

        // Split the string using the specified delimiter
        String[] substrings = str.split(delimiter);

        System.out.println("Sub-strings:");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }
}
