import java.util.Scanner;
public class Project {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int mynumber = (int)(Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Guess my number (1-100): ");
            userNumber = sc.nextInt();

            if( mynumber == userNumber) {
                System.out.println("You are right");
                break;
            }
            else if(mynumber > userNumber) {
                System.out.println(" Your number is large.");
            }
            else {
                System.out.println("Your number is small.");
            }
        }
        while(userNumber >= 0);
        System.out.println("My number Was : " + mynumber);

sc.close();

    }
}
