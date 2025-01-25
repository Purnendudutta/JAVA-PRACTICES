//  1. Syntax Errors
//  Syntax errors occur when the code does not conform to the rules of the Java language. These errors are detected by the compiler. Example:
//  
//  public class SyntaxErrorExample {
//      public static void main(String[] args) {
//          // Missing semicolon
//          System.out.println("Hello, world!")
//      }
//  }
//  Output: 
//  Error: ';' expected
//  
//  2. Runtime Errors
//  Runtime errors occur while the program is running. These errors cause the program to terminate abnormally. Example:
//  
//  public class RuntimeErrorExample {
//      public static void main(String[] args) {
//          int num = 10 / 0; // Division by zero
//          System.out.println("This will not be printed.");
//      }
//  }
//  Output:
//  Exception in thread "main" java.lang.ArithmeticException: / by zero
//  
//  3. Logical Errors
//  Logical errors occur when the code compiles and runs, but the output is not as expected due to a mistake in the logic. Example:
//  
  public class LogicalErrorExample {
      public static void main(String[] args) {
          int num1 = 10;
          int num2 = 20;
          int sum = num1 - num2; // Logical error: should be num1 + num2
          System.out.println("Sum: " + sum);
      }
  }
//  Output:
//  Sum: -10