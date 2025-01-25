public class ExceptionMethodsExample {
    public static void main(String[] args) {
        try {
            // Simulate an exception
            throw new Exception("Custom exception message");
        } catch (Exception e) {
            // Using different exception methods
            System.out.println("Message: " + e.getMessage());
            System.out.println("toString: " + e.toString());
            System.out.println("Cause: " + e.getCause());
            
            System.out.println("Stack Trace:");
            e.printStackTrace();

            // Working with stack trace elements
            for (StackTraceElement element : e.getStackTrace()) {
                System.out.println("Class: " + element.getClassName());
                System.out.println("Method: " + element.getMethodName());
                System.out.println("Line: " + element.getLineNumber());
            }
        }
    }
}


//  1. getMessage()
//  Description: Returns a detailed message about the exception. This is often the string passed to the exception's constructor.
//  Syntax:
//  String message = exception.getMessage();

//  2. toString()
//  Description: Returns a string representation of the exception, which includes the exception's class name and its message.
//  Syntax:
//  String exceptionDetails = exception.toString();

//  3. printStackTrace()
//  Description: Prints the exception's stack trace to the standard error stream or another output stream (e.g., a file or log).
//  Overloaded Forms:
//  void printStackTrace()
//  void printStackTrace(PrintStream s)
//  void printStackTrace(PrintWriter s)
//  Example:
//  exception.printStackTrace();

//  4. getStackTrace()
//  Description: Returns an array of StackTraceElement objects representing the stack trace at the time the exception was created.
//  Syntax:
//  StackTraceElement[] stackTrace = exception.getStackTrace();

//  5. addSuppressed(Throwable exception) (Since Java 7)
//  Description: Adds an exception to the list of suppressed exceptions. Suppressed exceptions are exceptions that are thrown while another exception is being handled.
//  Syntax:
//  exception.addSuppressed(suppressedException);

//  6. getSuppressed() (Since Java 7)
//  Description: Returns an array of suppressed exceptions associated with the current exception.
//  Syntax:
//  Throwable[] suppressed = exception.getSuppressed();

//  7. initCause(Throwable cause)
//  Description: Initializes the cause of the exception, which represents the underlying reason for this exception.
//  Syntax:
//  exception.initCause(cause);

//  8. getCause()
//  Description: Returns the cause of the exception, or null if the cause is not initialized.
//  Syntax:
//  Throwable cause = exception.getCause();