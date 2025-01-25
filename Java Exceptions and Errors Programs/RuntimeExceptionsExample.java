public class RuntimeExceptionsExample {
    public static void main(String[] args) {

        //PUT ANY OF THE BELOW CODE HERE        
        
    }
}

//1. NullPointerException
//This exception occurs when an application attempts to use null where an object is required.

//  try {
//    String str = null;
//    System.out.println(str.length());
//  } catch (NullPointerException e) {
//    System.out.println("Caught NullPointerException: " + e.getMessage());
//  }

//2. ArrayIndexOutOfBoundsException
//This exception occurs when an array has been accessed with an illegal index.

//  try {
//      int[] arr = new int[5];
//      System.out.println(arr[5]);
//  } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
//  }

//3. ArithmeticException
//This exception occurs when an exceptional arithmetic condition has occurred, such as divide by zero.

//  try {
//      int result = 10 / 0;
//  } catch (ArithmeticException e) {
//      System.out.println("Caught ArithmeticException: " + e.getMessage());
//  }

//4. ClassCastException
//This exception occurs when an application attempts to cast an object to a subclass of which it is not an instance.

//  try {
//      Object obj = "Hello";
//      Integer num = (Integer) obj;
//  } catch (ClassCastException e) {
//      System.out.println("Caught ClassCastException: " + e.getMessage());
//  }

//5. IllegalArgumentException
//This exception occurs when a method has been passed an illegal or inappropriate argument.

//  try {
//      Thread thread = new Thread();
//      thread.setPriority(11);
//  } catch (IllegalArgumentException e) {
//      System.out.println("Caught IllegalArgumentException: " + e.getMessage());
//  }

//6. NumberFormatException
//This exception occurs when an application attempts to convert a string to a numeric type, but the string does not have the appropriate format.

//  try {
//      String str = "abc";
//      int num = Integer.parseInt(str);
//  } catch (NumberFormatException e) {
//      System.out.println("Caught NumberFormatException: " + e.getMessage());
//  }