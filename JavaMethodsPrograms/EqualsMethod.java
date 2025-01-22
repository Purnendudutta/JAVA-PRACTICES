class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the references are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Ensure same class

        Person person = (Person) obj; // Typecast to Person
        return age == person.age && name.equals(person.name); // Compare fields
    }
}
public class EqualsMethod {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
    }
}
