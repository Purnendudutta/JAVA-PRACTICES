import java.util.Scanner;
public class OrderDemo {
    public static void main(String[] args){
        System.out.println("1.Soup\n2.Main Course\n3.Dessert\n4.Beverage\n5.Exit");
        //ask input from user
        System.out.println("Enter your choice: ");
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();
        int check=input;
        //keep looping until user input 5 which is Exit
        do{
            System.out.println("Please enter 1-5\n1.Soup\n2.Main Course\n3.Dessert\n4.Beverage\n5.Exit");
            int input1=scan.nextInt();
            check=input1;
            switch (check){
            case 1 :
                System.out.println("1.Mushroom Soup\n2.Miso Soup\n3.Tomato Soup");
                break;
            case 2 :
                System.out.println("1.Chiken Katsu Don\n2.Curry Katsu Don\n3.Teriyaki Katsu Don\n4.Curry Udon");
                break;
            case 3 :
                System.out.println("1.Matcha Ice Cream\n2.Chocolate Ice Cream\n3.Oreo Chocolate\n4.Dango");
                break;
            case 4 :
                System.out.println( "1.Green Tea\n2.Matcha RedBean\n3.Chocolate MilkShake\n4.Strawberry Ice Blended");
                break;
            case 5 :
                System.exit(0);
                break;
            }
        }
        while (input!=5);
    }
}
