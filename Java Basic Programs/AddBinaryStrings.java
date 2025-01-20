public class AddBinaryStrings {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Traverse both strings from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0; // Get bit from string a or 0 if out of bounds
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0; // Get bit from string b or 0 if out of bounds

            int sum = bitA + bitB + carry; // Calculate sum of bits and carry
            result.append(sum % 2);       // Append the binary result (0 or 1)
            carry = sum / 2;              // Update carry

            i--;
            j--;
        }

        // Reverse the result since we appended from least significant bit to most significant
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1101";

        String sum = addBinary(a, b);
        System.out.println("Sum of binary strings: " + sum);
    }
}
