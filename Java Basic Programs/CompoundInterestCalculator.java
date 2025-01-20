import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year: ");
        int numberOfTimesCompounded = scanner.nextInt();

        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        double compoundInterest = principal * Math.pow((1 + (rate / 100) / numberOfTimesCompounded), numberOfTimesCompounded * time) - principal;

        System.out.println("The Compound Interest is: " + compoundInterest);
    
        // Close the scanner
        scanner.close();
    }
}
