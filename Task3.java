import java.util.Scanner;

// BankAccount class representing the user's bank account
class BankAccount {
    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to deposit money into the account
    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true; // Deposit successful
        } else {
            return false; // Deposit failed, invalid amount
        }
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true; // Withdrawal successful
        } else {
            return false; // Withdrawal failed, insufficient funds or invalid amount
        }
    }

    // Method to check the account balance
    public double checkBalance() {
        return balance;
    }
}

// ATM class representing the ATM machine
class ATM {
    private BankAccount userAccount;

    // Constructor to initialize the ATM with a user's bank account
    public ATM(BankAccount userAccount) {
        this.userAccount = userAccount;
    }

    // Method to perform a withdrawal transaction
    public String withdraw(double amount) {
        if (userAccount.withdraw(amount)) {
            return "Withdrawal successful. Remaining balance: " + userAccount.checkBalance();
        } else {
            return "Withdrawal failed. Insufficient funds or invalid amount.";
        }
    }

    // Method to perform a deposit transaction
    public String deposit(double amount) {
        if (userAccount.deposit(amount)) {
            return "Deposit successful. New balance: " + userAccount.checkBalance();
        } else {
            return "Deposit failed. Invalid amount.";
        }
    }

    // Method to check the account balance
    public String checkBalance() {
        return "Current balance: " + userAccount.checkBalance();
    }
}

// Main class for running the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting initial balance from the user
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Creating a BankAccount object with the initial balance
        BankAccount userAccount = new BankAccount(initialBalance);

        // Creating an ATM object with the user's bank account
        ATM atmMachine = new ATM(userAccount);

        // Example usage
        System.out.println(atmMachine.withdraw(500));  // Should print: Withdrawal successful. Remaining balance: 500.0
        System.out.println(atmMachine.deposit(200));    // Should print: Deposit successful. New balance: 700.0
        System.out.println(atmMachine.checkBalance());  // Should print: Current balance: 700.0
        System.out.println(atmMachine.withdraw(1000)); // Should print: Withdrawal failed. Insufficient funds or invalid amount.

        scanner.close();
    }
}
