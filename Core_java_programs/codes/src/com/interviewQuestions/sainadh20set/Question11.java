package com.interviewQuestions.sainadh20set;

class Account1{
	String account_number;
	String account_holder_name;
	double balance;
	 public Account1(String account_number, String account_holdername, double balance) {
	        this.account_number = account_number;
	        this.account_holder_name = account_holdername;
	        this.balance = balance;
	    }
	 public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	    }
	 public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn $" + amount);
	        } else {
	            System.out.println("Insufficient funds or invalid withdrawal amount");
	        }
	 }
	 public void getAccountInfo() {
	        System.out.println("Account Number: " + account_number);
	        System.out.println("Account Holder: " + account_holder_name);
	        System.out.println("Balance: $" + balance);
	    }
}
class SavingsAccount1 extends Account1{
	 public SavingsAccount1(String account_number, String account_holdername, double balance, double d) {
		super(account_number, account_holdername, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	 public void deposit(double amount) {
		 if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount");
	        }
	 }
	
	@Override
	 public void getAccountInfo() {
		   System.out.println("Account Number: " + account_number);
	        System.out.println("Account Holder: " + account_holder_name);
	        System.out.println("Balance: $" + balance);
	}
}
class CheckingAccount1 extends Account1{

	public CheckingAccount1(String account_number, String account_holdername, double balance, double d) {
		super(account_number, account_holdername, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	 public void withdraw(double amount) {
		 if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn $" + amount);
	        } else {
	            System.out.println("Insufficient funds or invalid withdrawal amount");
	        }
	}
	@Override
	 public void getAccountInfo() {
		   System.out.println("Account Number: " + account_number);
	        System.out.println("Account Holder: " + account_holder_name);
	        System.out.println("Balance: $" + balance);
	}	
}
public class Question11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount1 savingsAcc = new SavingsAccount1("SA12345", "John Doe", 1000.0, 3.0);
        CheckingAccount1 checkingAcc = new CheckingAccount1("CA67890", "Jane Smith", 1500.0, 500.0);
        
        savingsAcc.getAccountInfo();
        savingsAcc.deposit(20000.0);
        System.out.println();
        checkingAcc.getAccountInfo();
        checkingAcc.withdraw(2000.0);
        checkingAcc.getAccountInfo();
	}

}