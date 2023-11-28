package com.interviewQuestions.sainadh20set;

class Bank{
	private double balance;
	public Bank(double initialBalance) {
        if (initialBalance < 0) {
            System.out.println("Initial balance cannot be negative.");
        } else {
            this.balance = initialBalance;
        }
}
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
	}
        public void withdraw(double amount) {
            if (amount > 0) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Withdrawn: $" + amount);
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
} 
        public void checkBalance() {
    System.out.println("Balance: $" + balance);
}
}
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bank account = new Bank(1000);
	        account.deposit(500);
	        account.checkBalance();
	        account.withdraw(200);
	        account.checkBalance();
	        account.withdraw(1500);
	        account.checkBalance();
	        account.deposit(-200);
	        account.withdraw(-100);
	}

}
