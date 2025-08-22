
import java.util.Scanner;

// Base class: BankAccount
class BankAccount {
    protected String name;
    protected String accountNumber;
    protected String address;
    protected double balance;

    // Constructor
    public BankAccount(String name, String accountNumber, String address, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance!");
        }
    }

    // Method to display balance
    public void display() {
        System.out.println("\nAccount Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}

// Derived class: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String name, String accountNumber, String address, double balance, double interestRate) {
        super(name, accountNumber, address, balance);
        this.interestRate = interestRate;
    }

    // Method to calculate amount after 1 year with interest
    public void calcAmt() {
        double newBalance = balance + (balance * interestRate / 100);
        System.out.println("Balance after 1 year with interest: " + newBalance);
    }
}

// Main class to demonstrate user-defined inputs
public class Practicce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter Address: ");
        String address = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = scanner.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double interestRate = scanner.nextDouble();

        // Creating instance of SavingsAccount with user inputs
        SavingsAccount acc = new SavingsAccount(name, accountNumber, address, balance, interestRate);

        // Display initial account details
        acc.display();

        // Performing deposit
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        acc.deposit(depositAmount);

        // Performing withdrawal
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        acc.withdraw(withdrawAmount);

        // Display updated account details
        acc.display();

        // Calculate balance after 1 year
        acc.calcAmt();

        scanner.close();
    }
}
