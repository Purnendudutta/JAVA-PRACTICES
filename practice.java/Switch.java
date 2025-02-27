import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your Age : ");
        Scanner a = new Scanner(System.in);
        age = a.nextInt();
        switch (age) {
            case 40:
                System.out.println("You are Experienced");
                break;
            case 30:
                System.out.println("You are Semi-Experienced");
                break;
            case 20:
                System.out.println("You are Not Experienced");
                break;
            default:
                System.out.println("Enjoy your Life");
        }

a.close();
    }
}
