// Define the interface
interface Animal {
    void makeSound();
    void move();
}

// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    
    @Override
    public void move() {
        System.out.println("Running...");
    }
}

// Main class
public class Interface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.move();
    }
}
