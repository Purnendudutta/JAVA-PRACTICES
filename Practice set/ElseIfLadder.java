import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age : ");
        Scanner a = new Scanner(System.in);
        age = a.nextInt();
        if (age>=40) {
            System.out.println("You are Experienced");        
        }
        else if (age>=30) {
            System.out.println("You are Semi-Experienced");        
        }
        else if (age>=20) {
            System.out.println("You are Not Experienced");        
        }

        a.close();

    }
}