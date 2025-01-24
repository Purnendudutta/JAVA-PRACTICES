public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "hello, world!";

        // Using equals() method
        boolean areEqual = str1.equals(str2);
        System.out.println("Are the strings equal using equals()? " + areEqual);

        // Using equalsIgnoreCase() method
        boolean areEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Are the strings equal using equalsIgnoreCase()? " + areEqualIgnoreCase);

        // Using compareTo() method
        int comparisonResult = str1.compareTo(str2);
        if (comparisonResult == 0) {
            System.out.println("The strings are equal using compareTo().");
        } else if (comparisonResult > 0) {
            System.out.println("The first string is greater than the second using compareTo().");
        } else {
            System.out.println("The first string is less than the second using compareTo().");
        }
    }
}
