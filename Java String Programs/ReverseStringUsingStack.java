import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop all characters from the stack and build the reversed string
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr.toString());
    }
}
