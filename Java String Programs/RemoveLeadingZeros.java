public class RemoveLeadingZeros {
    public static void main(String[] args) {
        String str = "0001234500";
        
        // Using regular expression to remove leading zeros
        str = str.replaceFirst("^0+(?!$)", "");
        
        System.out.println("String after removing leading zeros: " + str);
    }
}
