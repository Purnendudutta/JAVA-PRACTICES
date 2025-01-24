// Java program to demonstrate that
// In both static and non-static methods,
// static methods are directly accessed.

public class StaticNonstatic {
  
    static int num = 100;
    static String str = "GeeksForGeeks";

    // This is Static method
    static void display()
    {
        System.out.println("static number is " + num);
        System.out.println("static string is " + str);
    }

    // non-static method
    void nonstatic()
    {
        // our static method can accessed 
        // in non static method
        display();
    }

    // main method
    public static void main(String args[])
    {
        StaticNonstatic obj = new StaticNonstatic();
      
        // This is object to call non static method
        obj.nonstatic();
      
        // static method can called 
        // directly without an object
        display();
    }
}