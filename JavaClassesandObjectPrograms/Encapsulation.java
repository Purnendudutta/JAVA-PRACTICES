// Define a class with encapsulation
class Person {
    // Private variables
    private String name;
    private int age;

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero.");
        }
    }
}

// Main class
public class Encapsulation {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person person = new Person();
        
        // Set values using setter methods
        person.setName("John Doe");
        person.setAge(25);

        // Get values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
