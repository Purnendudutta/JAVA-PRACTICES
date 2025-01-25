//  1. FileNotFoundException
//  Occurs when an attempt to open a file denoted by a specified pathname has failed.
//  
  import java.io.File;
  import java.io.FileNotFoundException;
  import java.io.FileReader;
  
  public class FileNotFoundExample {
      public static void main(String[] args) {
          try {
              File file = new File("nonexistentfile.txt");
              FileReader fileReader = new FileReader(file);
          } catch (FileNotFoundException e) {
              System.out.println("Caught FileNotFoundException: " + e.getMessage());
          }
      }
  }

//  2. IOException
//  Occurs when an I/O operation fails or is interrupted.
//  
//  import java.io.BufferedReader;
//  import java.io.FileReader;
//  import java.io.IOException;
//
//  public class IOExceptionExample {
//      public static void main(String[] args) {
//          try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
//              String line;
//              while ((line = reader.readLine()) != null) {
//                  System.out.println(line);
//              }
//          } catch (IOException e) {
//              System.out.println("Caught IOException: " + e.getMessage());
//          }
//      }
//  }

//  3. SQLException
//  Occurs when there is any issue with the database access.

//  import java.sql.Connection;
//  import java.sql.DriverManager;
//  import java.sql.SQLException;
//  import java.sql.Statement;
//  
//  public class SQLExceptionExample {
//      public static void main(String[] args) {
//          try {
//              Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
//              Statement statement = connection.createStatement();
//              statement.executeQuery("SELECT * FROM mytable");
//          } catch (SQLException e) {
//              System.out.println("Caught SQLException: " + e.getMessage());
//          }
//      }
//  }
//  4. ClassNotFoundException
//  Occurs when an application tries to load a class through its string name but no definition for the class with the specified name could be found.
//  
//  java
//  public class ClassNotFoundExceptionExample {
//      public static void main(String[] args) {
//          try {
//              Class.forName("com.example.NonExistentClass");
//          } catch (ClassNotFoundException e) {
//              System.out.println("Caught ClassNotFoundException: " + e.getMessage());
//          }
//      }
//  }