public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Using StringBuilder
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse();
        String reversedStr = strBuilder.toString();
        
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
