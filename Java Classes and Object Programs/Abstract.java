// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass (inherited from Animal)
class Dog extends Animal {
    // Provide implementation for the abstract method
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Main class
public class Abstract {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
        
        // Call the abstract method implemented in the Dog class
        myDog.makeSound();
        
        // Call the regular method from the Animal class
        myDog.sleep();
    }
}
