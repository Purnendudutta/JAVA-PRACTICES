// Define the Student class
class Student {
    // Class attributes
    private String name;
    private int id;
    private double[] grades;

    // Class constructor
    public Student(String name, int id, double[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.print("Grades: ");
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    // Method to calculate the average grade
    public double calculateAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}

// Main class to create objects and interact with them
public class Class {
    public static void main(String[] args) {
        // Array of grades for each student
        double[] grades1 = {85.5, 90.0, 78.0};
        double[] grades2 = {92.0, 88.5, 79.5};

        // Create objects of the Student class
        Student student1 = new Student("Alice", 101, grades1);
        Student student2 = new Student("Bob", 102, grades2);

        // Call the methods to display details and calculate average grade for each student
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println("Average Grade: " + student1.calculateAverageGrade());

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
        System.out.println("Average Grade: " + student2.calculateAverageGrade());
    }
}
