// Base class (superclass)
class Animal {
    // Method in superclass
    public void eat() {
        System.out.println("Eating...");
    }
}

// Derived class (subclass) that inherits from Animal
class Dog extends Animal {
    // Method in subclass
    public void bark() {
        System.out.println("Woof!");
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
        
        // Call methods from both the superclass and subclass
        myDog.eat(); // Inherited from Animal class
        myDog.bark(); // Defined in Dog class
    }
}
