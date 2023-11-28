package pizza;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;
    private String accountHolderName;
    private String username;
    private String password;

    public Account(int accountNumber, double balance, String accountHolderName, String username, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.username = username;
        this.password = password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean verifyLogin(String enteredUsername, String enteredPassword) {
        return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds");
            return false;
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean transfer(Account recipient, double amount) {
        if (this.withdraw(amount)) {
            recipient.deposit(amount);
            return true;
        } else {
            System.out.println("Transfer failed. Insufficient funds.");
            return false;
        }
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Account not found
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(1, 0, "John Doe", "john123", "password123");
        Account account2 = new Account(2, 0, "Jane Smith", "jane456", "password456");

        bank.addAccount(account1);
        bank.addAccount(account2);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Banking Application");
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        Account loggedInAccount = null;

        for (Account account : bank.getAccounts()) {
            if (account.verifyLogin(enteredUsername, enteredPassword)) {
                loggedInAccount = account;
                break;
            }
        }

        if (loggedInAccount != null) {
            System.out.println("Login successful. Welcome, " + loggedInAccount.getAccountHolderName());

            int choice;
            do {
                System.out.println("Choose an option:");
                System.out.println("1. Balance Inquiry");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transfer");
                System.out.println("5. Logout");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Balance: " + loggedInAccount.getBalance());
                        break;
                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        loggedInAccount.deposit(depositAmount);
                        System.out.println("Deposited " + depositAmount + " successfully.");
                        break;
                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        if (loggedInAccount.withdraw(withdrawalAmount)) {
                            System.out.println("Withdrawn " + withdrawalAmount + " successfully.");
                        }
                        break;
                    case 4:
                        System.out.print("Enter recipient's account number: ");
                        int recipientAccountNumber = scanner.nextInt();
                        Account recipientAccount = bank.findAccount(recipientAccountNumber);
                        if (recipientAccount != null) {
                            System.out.print("Enter transfer amount: ");
                            double transferAmount = scanner.nextDouble();
                            if (loggedInAccount.transfer(recipientAccount, transferAmount)) {
                                System.out.println("Transferred " + transferAmount + " successfully to account " + recipientAccountNumber);
                            }
                        } else {
                            System.out.println("Recipient account not found.");
                        }
                        break;
                    case 5:
                        System.out.println("Logged out. Thank you for using the Banking Application.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 5);
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }
}


