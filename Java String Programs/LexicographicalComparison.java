public class LexicographicalComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        int comparisonResult = str1.compareTo(str2);

        if (comparisonResult == 0) {
            System.out.println("The strings are equal.");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is lexicographically greater than the second.");
        } else {
            System.out.println("The first string is lexicographically less than the second.");
        }
    }
}
