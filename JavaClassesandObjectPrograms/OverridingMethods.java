// Demonstrating Method Overriding in Java

// Parent class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animals make sounds.");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows.");
    }
}

public class OverridingMethods {
    public static void main(String[] args) {
        // Using parent class reference for child objects
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Calling overridden methods
        animal1.sound(); // Outputs: Dog barks.
        animal2.sound(); // Outputs: Cat meows.
    }
}
