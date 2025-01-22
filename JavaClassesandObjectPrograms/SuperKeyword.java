class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }

    void callSuperSound() {
        // Call the sound() method of the superclass (Animal)
        super.sound();
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();       // Calls Dog's sound method
        dog.callSuperSound(); // Calls Animal's sound method using super
    }
}
