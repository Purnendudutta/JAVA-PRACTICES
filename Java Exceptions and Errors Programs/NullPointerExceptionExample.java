//  1. NullPointerException
//  
//  public class NullPointerExceptionExample {
//      public static void main(String[] args) {
//          String str = null;
//          try {
//              System.out.println(str.length()); // This will throw NullPointerException
//          } catch (NullPointerException e) {
//              System.out.println("Caught NullPointerException: " + e.getMessage());
//          }
//      }
//  }
//  Output:
//  Caught NullPointerException: Cannot invoke "String.length()" because "str" is null
//  
//  2. ArrayIndexOutOfBoundsException
//  
//  public class ArrayIndexOutOfBoundsExceptionExample {
//      public static void main(String[] args) {
//          int[] arr = new int[5];
//          try {
//              System.out.println(arr[5]); // This will throw ArrayIndexOutOfBoundsException
//          } catch (ArrayIndexOutOfBoundsException e) {
//              System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
//          }
//      }
//  }
//  Output:
//  Caught ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
//  
//  3. ArithmeticException
//  
//  public class ArithmeticExceptionExample {
//      public static void main(String[] args) {
//          try {
//              int result = 10 / 0; // This will throw ArithmeticException
//          } catch (ArithmeticException e) {
//              System.out.println("Caught ArithmeticException: " + e.getMessage());
//          }
//      }
//  }
//  Output:
//  Caught ArithmeticException: / by zero
//  
//  4. ClassCastException
//  
//  public class ClassCastExceptionExample {
//      public static void main(String[] args) {
//          Object obj = "Hello";
//          try {
//              Integer num = (Integer) obj; // This will throw ClassCastException
//          } catch (ClassCastException e) {
//              System.out.println("Caught ClassCastException: " + e.getMessage());
//          }
//      }
//  }
//  Output:
//  Caught ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer
//  
//  5. IllegalArgumentException
//  
//  public class IllegalArgumentExceptionExample {
//      public static void main(String[] args) {
//          try {
//              Thread thread = new Thread();
//              thread.setPriority(11); // This will throw IllegalArgumentException as the priority should be between 1 and 10
//          } catch (IllegalArgumentException e) {
//              System.out.println("Caught IllegalArgumentException: " + e.getMessage());
//          }
//      }
//  }
//  Output:
//  Caught IllegalArgumentException: Priority out of range: 11
//  
//  6. NumberFormatException
//  
//  public class NumberFormatExceptionExample {
//      public static void main(String[] args) {
//          String str = "abc";
//          try {
//              int num = Integer.parseInt(str); // This will throw NumberFormatException
//          } catch (NumberFormatException e) {
//              System.out.println("Caught NumberFormatException: " + e.getMessage());
//          }
//      }
//  }
//  Output:
//  Caught NumberFormatException: For input string: "abc"
