// A program demonstrating data hiding in a class
class BankAccount {
    // Private data members (hidden from outside classes)
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the object
    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        if (initialDeposit > 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
            System.out.println("Initial deposit must be positive. Balance set to 0.");
        }
    }

    // Public getter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Public setter for account holder name
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Public getter for balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
}

public class DataHiding {
    public static void main(String[] args) {
        // Creating an instance of BankAccount
        BankAccount account = new BankAccount("John Doe", 500);

        // Accessing data using public methods
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Modifying data using methods
        account.deposit(200);
        System.out.println("Balance after deposit: $" + account.getBalance());

        account.withdraw(100);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Trying to withdraw an invalid amount
        account.withdraw(700);
    }
}
